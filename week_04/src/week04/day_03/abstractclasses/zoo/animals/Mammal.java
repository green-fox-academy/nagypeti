package week04.day_03.abstractclasses.zoo.animals;

public class Mammal extends Animal {

  public Mammal() {
    this("");
  }

  public Mammal(String name) {
    this.name = name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

}
