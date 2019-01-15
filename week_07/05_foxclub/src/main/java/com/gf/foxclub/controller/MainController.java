package com.gf.foxclub.controller;

import com.gf.foxclub.repository.CanteenRepository;
import com.gf.foxclub.repository.CharacterRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  public static CharacterRepositoryImpl characters;

  @Autowired
  public MainController(CharacterRepositoryImpl characters, CanteenRepository canteenRepository) {
    this.characters = characters;
  }

  @GetMapping("/")
  public String main(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("c", characters.getCharacterBy(name));
    return "main";
  }

}
