package week04.day_03.abstractclasses.zoo.animals;

import week04.day_03.interfaces.flyable.flyable.Flyable;

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
