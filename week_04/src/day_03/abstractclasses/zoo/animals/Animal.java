package day_03.abstractclasses.zoo.animals;

public abstract class Animal {

  protected String name;
  protected int age;

  public String getName() {
    return name;
  }

  public abstract String breed();

}
