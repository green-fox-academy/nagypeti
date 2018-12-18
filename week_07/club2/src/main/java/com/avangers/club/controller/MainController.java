package com.avangers.club.controller;
import com.avangers.club.model.Character;
import com.avangers.club.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  private CharacterRepository characters;

  @Autowired
  public MainController(CharacterRepository characters) {
    this.characters = characters;
  }

  @GetMapping("/")
  public String main(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("c", characters.findById(name));
    return "main";
  }

  @GetMapping("/login")
  public String login(Model model) {
    model.addAttribute("character", new Character());
    return "login";
  }

  @PostMapping("/login")
  public String create(@ModelAttribute("character") Character character, RedirectAttributes rd) {
    characters.save(character);
    rd.addAttribute("name", character.getName());
    return "redirect:/";
  }

}
