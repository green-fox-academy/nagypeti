package com.gf.foxclub.service;

import java.util.ArrayList;
import java.util.List;

public class Character {

  private String name;
  private String type;
  private List<String> availableTypes;
  private String food;
  private String drink;

  public Character() {
    this.availableTypes = new ArrayList<>();
    availableTypes.add("ironman");
    availableTypes.add("thor");
    availableTypes.add("captainamerica");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getAvailableTypes() {
    return availableTypes;
  }
}
