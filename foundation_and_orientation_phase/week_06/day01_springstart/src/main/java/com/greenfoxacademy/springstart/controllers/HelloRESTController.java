package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloRESTController {

  AtomicLong id = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(id.addAndGet(1), name);
  }

}
