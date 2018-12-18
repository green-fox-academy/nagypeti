package com.dbintegration.connecmysql.controller;

import com.dbintegration.connecmysql.repository.TodoRepositoryImpl;
import com.dbintegration.connecmysql.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepositoryImpl todoRepositoryImpl;

  @Autowired
  public TodoController(TodoRepositoryImpl todoRepositoryImpl) {
    this.todoRepositoryImpl = todoRepositoryImpl;
  }

  @GetMapping(value = {"", "/", "/list"})
  public String allTodos(Model model) {
    model.addAttribute("todos", this.todoRepositoryImpl.getTodos());
    return "listoftodos";
  }

  @GetMapping("/active")
  public String activeTodos(@RequestParam(name = "isActive", required = false) boolean isActive, Model model) {
    model.addAttribute("todos", this.todoRepositoryImpl.getTodos()
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
    this.todoRepositoryImpl.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    todoRepositoryImpl.deleteTodoBy(id);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoRepositoryImpl.getTodoBy(id));
    return "edit-todo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute("todo") Todo todo) {
    todoRepositoryImpl.addTodo(todo);
    return "redirect:/todo";
  }

}
