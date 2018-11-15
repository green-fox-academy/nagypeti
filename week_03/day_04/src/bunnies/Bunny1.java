package bunnies;

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {

  public static void main(String[] args) {

    System.out.println(earCounter(12,2));

  }

  public static int earCounter(int nrOfAnimals, int nrOfEarPerAnimal) {
    if (nrOfAnimals < 1)
      return 0;
    return earCounter(nrOfAnimals -1, nrOfEarPerAnimal) + nrOfEarPerAnimal;
  }

}
