package com.tourist.info.repository;

import com.tourist.info.model.Attraction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {

  Attraction findTopByCategoryOrderByPrice(String category);

  @Query(value = "SELECT DISTINCT category FROM attraction", nativeQuery = true)
  List<String> getCategorys();

}
