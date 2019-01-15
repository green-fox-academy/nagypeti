package com.dbintegration.connecmysql.repository;

import com.dbintegration.connecmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDoneFalseOrderByUrgentDesc();
  List<Todo> findAllByTitleContainsOrderByUrgentDesc(String searchfor);
  List<Todo> findAllByUrgentTrueOrderByDone();

}
