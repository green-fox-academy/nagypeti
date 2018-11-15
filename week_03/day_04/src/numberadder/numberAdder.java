package numberadder;

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class numberAdder {

  public static void main(String[] args) {

    numberAdder(1, 6);

  }

  public static void numberAdder(int from, int limit) {
    System.out.println(from);
    if (from == limit) {
      return;
    }
    numberAdder(from+1, limit);

  }
}
