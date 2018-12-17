package com.dbintegration.connecmysql.controller;

import com.dbintegration.connecmysql.model.TodoService;
import com.dbintegration.connecmysql.repository.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = {"", "/", "/list"})
  public String allTodos(Model model) {
    model.addAttribute("todos", this.todoService.getTodos());
    return "listoftodos";
  }

  @GetMapping("/active")
  public String activeTodos(@RequestParam(name = "isActive", required = false) boolean isActive, Model model) {
    model.addAttribute("todos", this.todoService.getTodos()
            .stream()
            .filter(todo -> !todo.isDone())
            .collect(Collectors.toList()));
    return "listoftodos";
  }

  @GetMapping("/add-todo")
  public String addTodo(Model model) {
   model.addAttribute("todo", new Todo());
    return "add-todo";
  }

  @PostMapping("/add-todo")
  public String addTodo(@ModelAttribute Todo todo) {
    this.todoService.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoService.getTodo(id));
    return "edit-todo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute("todo") Todo todo) {
    todoService.addTodo(todo);
    return "redirect:/todo";
  }

}
