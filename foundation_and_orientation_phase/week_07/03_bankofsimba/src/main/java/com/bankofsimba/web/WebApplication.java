package com.bankofsimba.web;

import com.bankofsimba.web.services.AccountList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

  public static AccountList demoBank = new AccountList();

  public static void main(String[] args) {
    SpringApplication.run(WebApplication.class, args);
  }
}
