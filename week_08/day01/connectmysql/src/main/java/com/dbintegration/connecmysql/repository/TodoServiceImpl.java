package com.dbintegration.connecmysql.repository;

import com.dbintegration.connecmysql.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  TodoRepository todoRepository;

  @Autowired
  TodoServiceImpl(TodoRepository todoRepository) {
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

  public List<Todo> findAllByDoneOrderByUrgent() {
    return todoRepository.findAllByDoneFalseOrderByUrgentDesc();
  }

  public List<Todo> findAllByTitleContainsOrderByUrgentDesc(String searchfor) {
    return todoRepository.findAllByTitleContainsOrderByUrgentDesc(searchfor);
  }



}
