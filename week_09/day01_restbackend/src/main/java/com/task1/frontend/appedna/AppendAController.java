package com.task1.frontend.appedna;

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
