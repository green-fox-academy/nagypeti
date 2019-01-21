package com.w08d01.dbintegration;

import com.w08d01.dbintegration.controller.TodoController;
import com.w08d01.dbintegration.model.TodoService;
import com.w08d01.dbintegration.repository.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbintegrationApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(DbintegrationApplication.class, args);
  }

  @Override
  public void run(String... args) {
    TodoController.todoService.addTodo(new Todo("Create task1 basics"));
    TodoController.todoService.addTodo(new Todo("Create task1 with JPA DI"));
  }

}

