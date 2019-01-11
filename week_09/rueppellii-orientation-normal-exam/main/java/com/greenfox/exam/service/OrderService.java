package com.greenfox.exam.service;

import com.greenfox.exam.model.Order;

public interface OrderService {

  void addOrder(Order order);
  Order orderById(Long id);

}
