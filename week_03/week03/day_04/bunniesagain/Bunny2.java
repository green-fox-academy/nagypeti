package day_04.bunniesagain;

public class Bunny2 {

  public static void main(String[] args) {

    System.out.println(earCounterHardCore(3, 2,3));

  }

  public static int earCounterHardCore(int nrOfBunnies, int oddBunniesEars, int evenBunnieEars) {

    if (nrOfBunnies == 0) {
      return 0;
    } else if (nrOfBunnies % 2 == 0) {
      return earCounterHardCore(nrOfBunnies - 1, 2, 3) + evenBunnieEars;
    }
    return earCounterHardCore(nrOfBunnies - 1,2,3) + oddBunniesEars;

  }

}
