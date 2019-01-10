package com.tourist.info.service;

import com.tourist.info.model.Attraction;

public interface AttractionService {

  Iterable<Attraction> getAttractions();
  void addAttraction(Attraction attraction);
  Attraction findById(Long id);
  void updateById(Long id, Attraction attraction);

}
