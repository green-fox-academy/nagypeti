package com.gf.foxclub.controller;

import com.gf.foxclub.model.Character;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/login")
public class LoginController {

  @GetMapping
  public String login(Model model) {
    model.addAttribute("char", new Character());
    return "login";
  }

  @PostMapping
  public String create(@ModelAttribute("char") Character character, RedirectAttributes rd) {
    Character tempChar;
    if (character.getName().equals(MainController.characters.getCharacterBy(character.getName()))) {
      tempChar =MainController.characters.getCharacterBy(character.getName());
    } else {
      MainController.characters.addCharacter(character);
    }
    rd.addAttribute("name", character.getName());
    return "redirect:/";
  }

}
