package day_04.numberadder;

public class numberAdder {

  public static void main(String[] args) {

    addNumbers(1, 6);

  }

  public static void addNumbers(int from, int limit) {
    System.out.println(from);
    if (from == limit) {
      return;
    }
    addNumbers(from + 1, limit);

  }
}
