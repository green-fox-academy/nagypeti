package day04.bunnies;

public class Bunny1 {

  public static void main(String[] args) {

    System.out.println(earCounter(12,2));

  }

  public static int earCounter(int nrOfAnimals, int nrOfEarPerAnimal) {
    if (nrOfAnimals < 1) {
      return 0;
    }
    return earCounter(nrOfAnimals - 1, nrOfEarPerAnimal) + nrOfEarPerAnimal;
  }

}
