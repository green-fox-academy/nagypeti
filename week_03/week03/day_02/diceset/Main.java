package day_02.diceset;

public class Main {

  public static void main(String[] args) {

    DiceSet diceSet = new DiceSet();

    for (int i = 0; i < 6; i++) {
      while ((diceSet.getCurrent(i)) != 6) {
        diceSet.reroll(i);
      }
    }
    System.out.println("Yes!");
    for (int i = 0; i < 6; i++) {
      System.out.print(diceSet.getCurrent(i) + " ");
    }
  }
}
