package com.gf.foxclub.controller;

import com.gf.foxclub.service.Character;
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
    model.addAttribute("c", new Character());
    return "login";
  }

  @PostMapping
  public String create(@ModelAttribute("c") Character character, RedirectAttributes rd) {
    MainController.characters.addCharacter(character);
    rd.addAttribute("name", character.getName());
    return "redirect:/";
  }

}
