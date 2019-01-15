package com.dependecies.exercises.controller;

import com.dependecies.exercises.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

  private UtilityService utility;

  @Autowired
  public UtilityController(UtilityService utility) {
    this.utility = utility;
  }

  @GetMapping("/useful")
  public String main() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model) {
    model.addAttribute("color", utility.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String email () {
    return "email";
  }

}
