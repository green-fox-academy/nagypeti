package day02.pirates;

/*
1, Create a BattleApp class with a main method
2, Create 2 ships, fill them with pirates
3, Have a battle!
*/

public class BattleApp {

  public static void main(String[] args) {

    Ship blackPearl = new Ship("Black Pearl");
    Ship flyingDutchman = new Ship("Flying Dutchman");

    blackPearl.calculateBattleScore();
    blackPearl.shipStatus();

    flyingDutchman.calculateBattleScore();
    flyingDutchman.shipStatus();

  }
}
