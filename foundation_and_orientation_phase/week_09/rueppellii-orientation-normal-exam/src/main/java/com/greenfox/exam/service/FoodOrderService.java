package com.greenfox.exam.service;

import com.greenfox.exam.model.FoodOrder;


public interface FoodOrderService {

  void addOrder(FoodOrder order);

  FoodOrder orderById(Long id);

  boolean existsById(Long id);

  Iterable<FoodOrder> findByStatus(String status);

  Iterable<FoodOrder> findByStatusAndToppingContaining(String status, String topping);

}
