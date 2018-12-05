package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;

@Controller
public class HelloController {

  @RequestMapping(value="/hello")
  @ResponseBody
  public String hello() {
    return "Hello World";
  }
}
