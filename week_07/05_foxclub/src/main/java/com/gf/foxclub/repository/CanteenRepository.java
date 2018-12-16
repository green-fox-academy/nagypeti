package com.gf.foxclub.repository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CanteenRepository {

  private List<String> food;
  private List<String> drink;

  public CanteenRepository() {
    food = new ArrayList<>(Arrays.asList("Cookies", "Energy", "Battery", "Roasted Pig", "Vegetables", "Pizza", "Gyros"));
    drink = new ArrayList<>(Arrays.asList("Beer", "Milk", "Water", "Seewater", "NutriJuice", "Battery acid"));
  }

  public List<String> getDrink() {
    return drink;
  }

  public List<String> getFood() {
    return food;
  }

}
