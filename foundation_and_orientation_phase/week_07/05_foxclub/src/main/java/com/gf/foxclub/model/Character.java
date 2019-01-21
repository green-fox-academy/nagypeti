package com.gf.foxclub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Character {

  @Id
  private String name;
  private String type;
  private String food;
  private String drink;

  public Character() {
  }

  public Character(String name, String type) {
    this.name = name;
    this.type = type;
    this.food = null;
    this.drink = null;
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

}
