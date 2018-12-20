package com.reddit.tiptop.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long userId;
  private String username;
  private String password;

  public User() {

  }

}
