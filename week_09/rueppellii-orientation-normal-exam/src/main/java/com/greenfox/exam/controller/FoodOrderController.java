package com.greenfox.exam.controller;

import com.greenfox.exam.model.FoodOrder;
import com.greenfox.exam.service.FoodOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FoodOrderController {

  private FoodOrderServiceImpl service;

  @Autowired
  public FoodOrderController(FoodOrderServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/")
  public String orderPage(Model model) {
    model.addAttribute("order", new FoodOrder());
    return "index";
  }

  @PostMapping("/order")
  public String saveOrder(FoodOrder order, RedirectAttributes redir) {
    service.addOrder(order);
    redir.addAttribute("id", order.getId());
    return "redirect:/order/{id}";
  }

  @GetMapping("/order/{id}")
  public String orderInfo(@PathVariable("id") Long id, Model model) {
    if (service.existsById(id)) {
      model.addAttribute("order", service.orderById(id));
      return "order-accepted";
    } else {
      model.addAttribute("error", "Order on id: " + id + " does not exist");
      return "error";
    }

  }

}
