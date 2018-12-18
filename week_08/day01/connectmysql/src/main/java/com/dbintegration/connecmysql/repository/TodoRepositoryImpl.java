package com.dbintegration.connecmysql.repository;

import com.dbintegration.connecmysql.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoRepositoryImpl{

  TodoRepository todoRepository;

  @Autowired
  TodoRepositoryImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  public Todo getTodoBy(Long id) {
    return todoRepository.findById(id).orElse(null);
  }

  public void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void deleteTodoBy(Long id) {
    todoRepository.deleteById(id);
  }

}
