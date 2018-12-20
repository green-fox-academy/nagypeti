package com.reddit.tiptop.controller;

import com.reddit.tiptop.repository.Post;
import com.reddit.tiptop.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class PostController {

  PostServiceImpl service;

  @Autowired
  PostController(PostServiceImpl service) {
    this.service = service;
  }

  @GetMapping
  public String mainPage() {
    return "main";
  }

  @GetMapping("/add")
  public String addPost() {
    return "add-post";
  }

  @GetMapping("/{id}/edit")
  public String editPost(@PathVariable long id, Model model) {
    model.addAttribute("post", service.getPostById(id));
    return "edit-post";
  }

  @PutMapping("/{id}/edit")
  public String editPost(@ModelAttribute("post") Post post) {
    service.editPost(post);
    return "redirect:/";
  }




}
