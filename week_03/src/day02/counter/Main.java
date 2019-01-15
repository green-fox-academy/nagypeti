package day02.counter;

public class Main {

  public static void main(String[] args) {

    Counter newCounter = new Counter(){};
    Counter newCounter1 = new Counter(14);

    newCounter.add();
    newCounter1.add();
    System.out.println(newCounter.get());
    System.out.println(newCounter1.get());
    newCounter.add(15);
    newCounter1.add(15);
    System.out.println(newCounter.get());
    System.out.println(newCounter1.get());


  }
}
