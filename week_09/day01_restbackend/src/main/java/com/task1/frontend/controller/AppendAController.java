package com.task1.frontend.controller;

import com.task1.frontend.repository.Append;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  @GetMapping("/appenda/{appendable}")
  public Append appendA(@PathVariable String appendable) {
    return new Append(appendable);
  }

}
