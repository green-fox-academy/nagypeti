package com.reddit.tiptop.service;

import com.reddit.tiptop.repository.User;

public interface UserService {

  User findById(long id);
  User findByName(String name);
  void addUser(User user);

}
