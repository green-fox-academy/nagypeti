package com.greenfox.exam.controller;

import static com.greenfox.exam.service.Validation.validateOrderStatus;

import com.greenfox.exam.model.FoodOrder;
import com.greenfox.exam.service.FoodOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class FoodOrderRestController {

  private FoodOrderServiceImpl service;

  @Autowired
  public FoodOrderRestController(FoodOrderServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/api/orders")
  public ResponseEntity<Iterable<FoodOrder>> listOrdersSorted(
          @RequestParam(value = "type") String type,
          @RequestParam(value = "status") String status) {
    if (type.equals("vegetarian") && validateOrderStatus(status)) {
      return new ResponseEntity<>(service.findByStatusAndToppingContaining(status, "smoked tofu"),
              HttpStatus.OK);
    } else if (type.equals("all") && validateOrderStatus(status)) {
      return new ResponseEntity<>(service.findByStatus(status), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  @PatchMapping ("/api/orders/{id}")
  public ResponseEntity<String> modifyOrderStatus(@PathVariable("id") Long id,
                                                  @RequestBody FoodOrder order) {
    if (validateOrderStatus(order.getStatus()) && service.existsById(id)) {
      return new ResponseEntity<>("Order status modified", HttpStatus.OK);
    } else if (!validateOrderStatus(order.getStatus())) {
      return new ResponseEntity<>("Order status not valid", HttpStatus.BAD_REQUEST);
    } else if (!service.existsById(id)) {
      return new ResponseEntity<>("No order exists with id: " + id, HttpStatus.NOT_FOUND);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }
}
