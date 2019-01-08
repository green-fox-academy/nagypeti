package com.trialexam.demo.controller;

import com.trialexam.demo.model.Alias;
import com.trialexam.demo.service.AliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  @Autowired
  AliasServiceImpl aliasService;

  @GetMapping("/")
  public String indexPage(@RequestParam(value = "id", required = false) Long id, Model model) {
    if (id != null) {
      model.addAttribute("message", "Your URL is aliased to "
              + aliasService.findById(id).getAliasName() + " and your secret code is "
              + aliasService.findById(id).getSecretCode() + ".");
    }
    model.addAttribute("newAlias", new Alias());
    return "index";
  }

  @PostMapping("/save-link")
  public String saveLink(@ModelAttribute("newAlias") Alias alias,
                         Model model, RedirectAttributes redir) {
    if (aliasService.existsAliasByAliasName(alias.getAliasName())) {
      model.addAttribute("message", "Your alias is already in use!");
      return "index";
    } else {
      aliasService.addAlias(alias);
      redir.addAttribute("id", aliasService.findAliasByName(alias.getAliasName()).getId());
      return "redirect:/?id={id}";
    }
  }

  @GetMapping("/a/{alias}")
  public Object getRequestedAlias(@PathVariable String alias) {
    if (aliasService.findAliasByName(alias) != null) {
      aliasService.incHitCount(alias);
      String url = aliasService.findAliasByName(alias).getUrl();
      return "redirect:" + url;
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }


}
