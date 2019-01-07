package com.task1.frontend.controller;

import com.task1.frontend.repository.Doubling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.task1.frontend.repository.Error;

@RestController
public class DoublingController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value="input", required = false) Integer input) {
    if (input != null) {
      return new Doubling(input);
    } else {
      return new Error("Please provide an input!");
    }
  }

}
