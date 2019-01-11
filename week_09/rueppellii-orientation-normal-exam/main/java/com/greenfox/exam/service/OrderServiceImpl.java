package com.greenfox.exam.service;

import com.greenfox.exam.model.Order;
import com.greenfox.exam.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.greenfox.exam.model.OrderStatus.ORDERED;

@Service
public class OrderServiceImpl implements OrderService{

  private OrderRepository repository;

  @Autowired
  public OrderServiceImpl(OrderRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addOrder(Order order) {
    order.setStatus(ORDERED);
    repository.save(order);
  }

  @Override
  public Order orderById(Long id) {
    return repository.findById(id).orElse(null);
  }

}
