package com.task1.frontend.greeter;

import com.task1.frontend.error.Error;
import com.task1.frontend.log.Log;
import com.task1.frontend.log.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @Autowired
  private LogServiceImpl logService;

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value="name", required = false) String name,
                        @RequestParam(value="title", required = false) String title) {
    if (name != null && title != null) {
      logService.createLog(new Log("/greeter", String.format("name_and_title=%s", name.concat(" " + title))));
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
