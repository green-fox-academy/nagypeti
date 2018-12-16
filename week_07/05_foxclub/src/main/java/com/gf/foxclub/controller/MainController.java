package com.gf.foxclub.controller;

import com.gf.foxclub.repository.CanteenRepository;
import com.gf.foxclub.service.CharacterList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  static CharacterList characters;
  static CanteenRepository canteenRepository;

  @Autowired
  public MainController(CharacterList characters, CanteenRepository canteenRepository) {
    this.characters = characters;
    this.canteenRepository = canteenRepository;
  }

  @GetMapping("/")
  public String main(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("c", characters.getCharacter(name));
    return "main";
  }

}
