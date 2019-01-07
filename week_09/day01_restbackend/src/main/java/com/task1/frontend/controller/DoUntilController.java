package com.task1.frontend.controller;

import com.task1.frontend.repository.DoUntil;
import com.task1.frontend.repository.Error;
import com.task1.frontend.repository.Until;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable String action, @RequestBody Until until) {
    if (action.equals("sum")) {
      DoUntil sumUntil = new DoUntil();
      sumUntil.setResult(sumUntil.sum(until.getUntil()));
      return sumUntil;
    } else if (action.equals(("factor"))) {
      DoUntil facUntil = new DoUntil();
      facUntil.setResult(facUntil.refactor(until.getUntil()));
      return facUntil;
    } else {
      return new Error("Please provide a number!");
    }
  }
}
