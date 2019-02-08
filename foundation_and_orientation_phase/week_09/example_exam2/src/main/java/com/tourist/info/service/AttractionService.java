package com.tourist.info.service;

import com.tourist.info.model.Attraction;

import java.util.List;

public interface AttractionService {

  Iterable<Attraction> getAttractions();

  void addAttraction(Attraction attraction);

  Attraction findById(Long id);

  List<Attraction> getLowestPriceByCategory();

}
