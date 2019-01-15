package com.w08d01.dbintegration.controller;

import com.w08d01.dbintegration.model.TodoService;
import com.w08d01.dbintegration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  public static TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = {"", "/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", this.todoService.getTodos());
    return "listoftodos";
  }

}
