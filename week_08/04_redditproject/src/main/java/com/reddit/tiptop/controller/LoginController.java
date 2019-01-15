package com.reddit.tiptop.controller;

import com.reddit.tiptop.repository.User;
import com.reddit.tiptop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

  UserServiceImpl userService;

  @Autowired
  LoginController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @GetMapping
  public String loginPage(Model model) {
    model.addAttribute("user", new User());
    return "login";
  }

  @PostMapping
  public String addUser(@ModelAttribute("user") User user, RedirectAttributes rd) {
    userService.addUser(user);
    rd.addAttribute("currentuser", user.getId());
    return "redirect:/{currentuser}";
  }

}
