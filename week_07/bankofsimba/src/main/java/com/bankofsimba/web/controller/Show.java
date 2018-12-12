package com.bankofsimba.web.controller;

import static com.bankofsimba.web.WebApplication.demoBank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Show {

  @GetMapping("/showall")
  public String demoAccount(Model model) {
    model.addAttribute("demoBank", demoBank.getAccountList());
    return "show";
  }

}
