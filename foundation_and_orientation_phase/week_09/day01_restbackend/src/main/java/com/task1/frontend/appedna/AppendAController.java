package com.task1.frontend.appedna;

import com.task1.frontend.log.Log;
import com.task1.frontend.log.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  @Autowired
  private LogServiceImpl logService;

  @GetMapping("/appenda/{appendable}")
  public Append appendA(@PathVariable String appendable) {
    logService.createLog(new Log("/appenda", String.format("appendable=%s", appendable)));
    return new Append(appendable);
  }

}
