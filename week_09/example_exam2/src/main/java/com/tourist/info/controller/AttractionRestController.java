package com.tourist.info.controller;

import com.tourist.info.model.Attraction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttractionRestController {

  @GetMapping("/budge")
  public ResponseEntity<List<Attraction>> getCheapestByCategory() {
    
  }

}
