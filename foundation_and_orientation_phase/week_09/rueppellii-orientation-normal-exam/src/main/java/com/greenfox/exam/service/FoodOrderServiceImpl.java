package com.greenfox.exam.service;

import com.greenfox.exam.model.FoodOrder;
import com.greenfox.exam.repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodOrderServiceImpl implements FoodOrderService {

  private FoodOrderRepository repository;

  @Autowired
  public FoodOrderServiceImpl(FoodOrderRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addOrder(FoodOrder order) {
    order.setStatus("ordered");
    repository.save(order);
  }

  @Override
  public FoodOrder orderById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public boolean existsById(Long id) {
    return repository.existsById(id);
  }

  @Override
  public Iterable<FoodOrder> findByStatus(String status) {
    return repository.findByStatus(status);
  }

  @Override
  public Iterable<FoodOrder> findByStatusAndToppingContaining(String status, String topping) {
    return repository.findByStatusAndToppingContaining(status, topping);
  }

}
