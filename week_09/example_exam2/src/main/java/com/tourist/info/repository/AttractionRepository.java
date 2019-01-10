package com.tourist.info.repository;

import com.tourist.info.model.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {

  Attraction findTopByCategoryOrderByPrice();

}
