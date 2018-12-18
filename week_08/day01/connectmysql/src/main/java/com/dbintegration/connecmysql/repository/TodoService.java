package com.dbintegration.connecmysql.repository;

import com.dbintegration.connecmysql.model.Todo;

import java.util.List;

public interface TodoService {

  public List<Todo> getTodos();

  public Todo getTodoBy(Long id);

  public void addTodo(Todo todo);

  public void deleteTodoBy(Long id);

}
