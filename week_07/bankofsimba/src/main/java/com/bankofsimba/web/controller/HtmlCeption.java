package com.bankofsimba.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlCeption {

  @GetMapping("/inception")
  public String inception(Model model) {
    model.addAttribute("html", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "inception";
  }

}
