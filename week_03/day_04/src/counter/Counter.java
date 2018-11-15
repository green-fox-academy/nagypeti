package counter;

// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {

  public static void main(String[] args) {

    counter(6);

  }

  public static void counter(int limit) {
    System.out.println(limit);
    if (limit == 0) {
      return;
    }
    counter(limit - 1);
  }

}
