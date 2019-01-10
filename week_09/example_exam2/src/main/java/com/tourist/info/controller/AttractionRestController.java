package com.tourist.info.controller;

import com.tourist.info.model.Attraction;
import com.tourist.info.service.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AttractionRestController {

  AttractionServiceImpl service;

  @Autowired
  public AttractionRestController(AttractionServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/budge")
  public ResponseEntity<List<Attraction>> getCheapestByCategory() {
    return new ResponseEntity<>(service.getLowestPriceByCategory(), HttpStatus.I_AM_A_TEAPOT);
  }

}
