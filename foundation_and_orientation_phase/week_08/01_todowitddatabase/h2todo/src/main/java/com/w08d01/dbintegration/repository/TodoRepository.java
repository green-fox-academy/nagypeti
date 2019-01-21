package com.w08d01.dbintegration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository  extends CrudRepository<Todo, Long> {

}
