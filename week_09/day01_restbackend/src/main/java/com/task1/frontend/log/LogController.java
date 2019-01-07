package com.task1.frontend.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {

  @Autowired
  private LogServiceImpl logService;

  @GetMapping("/log")
  public List<Log> logs(){
    return logService.logs();
  }


}
