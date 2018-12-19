package com.dbintegration.connecmysql.controller;

import com.dbintegration.connecmysql.repository.TodoServiceImpl;
import com.dbintegration.connecmysql.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoServiceImpl todoServiceImpl;

  @Autowired
  public TodoController(TodoServiceImpl todoServiceImpl) {
    this.todoServiceImpl = todoServiceImpl;
  }

  @GetMapping(value = {"", "/", "/list"})
  public String allTodos(Model model) {
    model.addAttribute("todos", this.todoServiceImpl.getTodos()
            .stream()
            .sorted(comparing(Todo::getId))
            .collect(Collectors.toList()));
    return "main";
  }

  @GetMapping("/active")
  public String activeTodos(Model model) {
    model.addAttribute("todos", this.todoServiceImpl.getTodos()
            .stream()
            .filter(todo -> !todo.isDone())
            .collect(Collectors.toList()));
    return "main";
  }

  @GetMapping("/add-todo")
  public String addTodo(Model model) {
   model.addAttribute("todo", new Todo());
    return "add-todo";
  }

  @PostMapping("/add-todo")
  public String addTodo(@ModelAttribute Todo todo) {
    this.todoServiceImpl.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    todoServiceImpl.deleteTodoBy(id);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoServiceImpl.getTodoBy(id));
    return "edit-todo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute("todo") Todo todo) {
    todoServiceImpl.addTodo(todo);
    return "redirect:/todo";
  }

}
