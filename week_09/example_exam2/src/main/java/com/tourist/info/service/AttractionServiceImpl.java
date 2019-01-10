package com.tourist.info.service;

import com.tourist.info.model.Attraction;
import com.tourist.info.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {

  @Autowired
  AttractionRepository repository;

  @Override
  public Iterable<Attraction> getAttractions() {
    return repository.findAll();
  }

  @Override
  public void addAttraction(Attraction attraction) {
    repository.save(attraction);
  }

  @Override
  public Attraction findById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public List<Attraction> getLowestPriceByCategory() {
    List<Attraction> filteredList = new ArrayList<>();
    for (String string : repository.getCategorys()) {
      filteredList.add(repository.findTopByCategoryOrderByPrice(string));
    }
    return filteredList;
  }


}
