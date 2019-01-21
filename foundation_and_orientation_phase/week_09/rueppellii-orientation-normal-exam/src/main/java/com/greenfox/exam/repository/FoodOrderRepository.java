package com.greenfox.exam.repository;

import com.greenfox.exam.model.FoodOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends CrudRepository<FoodOrder, Long> {

  boolean existsById(Long id);

  Iterable<FoodOrder> findByStatus(String status);

  Iterable<FoodOrder> findByStatusAndToppingContaining(String status, String topping);




}
