package com.task1.frontend.doubling;

import com.task1.frontend.log.Log;
import com.task1.frontend.log.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.task1.frontend.error.Error;

@RestController
public class DoublingController {

  @Autowired
  private LogServiceImpl logService;

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value="input", required = false) Integer input) {
    if (input != null) {
      logService.createLog(new Log("/doubling", String.format("input=%s", input)));
      return new Doubling(input);
    } else {
      return new Error("Please provide an input!");
    }
  }

}
