package day03.abstractclasses.zoo.animals;

import day03.interfaces.flyable.Flyable;

public class Bird extends EggLayers implements Flyable {

  public Bird() {
    this("");
  }

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }

}
