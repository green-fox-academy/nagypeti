package com.reddit.tiptop.service;

import com.reddit.tiptop.repository.User;
import com.reddit.tiptop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

  UserRepository users;

  @Autowired
  UserServiceImpl(UserRepository users) {
    this.users = users;
  }

  @Override
  public User findById(long id) {
    return users.findById(id).orElse(null);
  }

  @Override
  public User findByName(String name) {
    return users.findByUsername(name);
  }

  @Override
  public void addUser(User user) {
    users.save(user);
  }
}
