package com.gf.foxclub.controller;

import com.gf.foxclub.model.Character;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/canteen")
public class CanteenController {

  @GetMapping
  public String canteen(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("player", MainController.characters.getCharacterBy(name));
    return "canteen";
  }

  @PostMapping
  public String afterSelect(@ModelAttribute("player") Character character, RedirectAttributes rd) {
    rd.addFlashAttribute("name", character.getName());
    return "redirect:/";
  }

}
