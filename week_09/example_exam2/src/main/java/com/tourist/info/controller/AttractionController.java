package com.tourist.info.controller;

import com.tourist.info.model.Attraction;
import com.tourist.info.service.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AttractionController {

  private AttractionServiceImpl service;

  @Autowired
  public AttractionController(AttractionServiceImpl service) {
    this.service = service;
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("attractions", service.getAttractions());
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("attraction", new Attraction());
    return "index";
  }

  @PostMapping("/add")
  public String addAttraction(Attraction attraction) {
    service.addAttraction(attraction);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String editAttraction(@PathVariable("id") Long id, Model model) {
    model.addAttribute("attraction", service.findById(id));
    return "index";
  }



}
