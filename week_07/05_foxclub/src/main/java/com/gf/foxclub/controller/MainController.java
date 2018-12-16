package com.gf.foxclub.controller;

import com.gf.foxclub.service.Character;
import com.gf.foxclub.service.CharacterList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  private CharacterList characters;

  @Autowired
  public MainController(CharacterList characters) {
    this.characters = characters;
  }

  @GetMapping("/")
  public String main(@RequestParam(value = "name", required = false) String name,
                     @RequestParam(value = "type", required = false) String type, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    Character character = characters.getCharacter(name);
    model.addAttribute("character", character);
    return "main";
  }

  @GetMapping("/login")
  public String login(Model model) {
    model.addAttribute("character", new Character());
    return "login";
  }

  @PostMapping("/login")
  public String create(@ModelAttribute("character") Character character, RedirectAttributes rd) {
    characters.addCharacter(character);
    rd.addAttribute("name", character.getName());
    rd.addAttribute("type", character.getType());
    return "redirect:/";
  }

}
