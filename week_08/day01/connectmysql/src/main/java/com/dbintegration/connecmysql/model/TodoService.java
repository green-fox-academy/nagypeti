package com.dbintegration.connecmysql.model;

import com.dbintegration.connecmysql.repository.Todo;
import com.dbintegration.connecmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  public Todo getTodo(Long id) {
    return todoRepository.findById(id).orElse(null);
  }

  public void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void updateTodo(Todo todo) {
   todoRepository.save(todo);
  }

  public void deleteTodo(Long id) {
    todoRepository.deleteById(id);
  }
}
