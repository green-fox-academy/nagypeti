package com.task1.frontend.controller;

import com.task1.frontend.repository.Error;
import com.task1.frontend.repository.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value="name", required = false) String name,
                        @RequestParam(value="title", required = false) String title) {
    if (name != null && title != null) {
      return new Person(name, title);
    } else if (name == null && title == null){
      return new Error("Please provide a name and a title!");
    } else if (name == null){
      return new Error("Please provide a name!");
    } else {
      return new Error("Please provide a title!");
    }
  }

}
