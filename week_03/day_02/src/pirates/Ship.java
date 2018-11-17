package pirates;

import java.util.ArrayList;
import java.util.List;

/*
1, Create a Ship class.
2, The Ship stores Pirate-s instances in a list
as the crew and has one captain who is also a Pirate.
- When a ship is created it doesn't have a crew or a captain.
3, The ship can be filled with pirates and a captain via fillShip() method.
- Filling the ship with a captain and random number of pirates.
4, Ships should be represented in a nice way on command line including information about:
- captains consumed rum, state (passed out / died)
- number of alive pirates in the crew
5, Ships should have a method to battle other ships: ship.battle(otherShip)
- should return true if the actual ship (this) wins
- the ship should win if its calculated score is higher
- calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
- The loser crew has a random number of losses (deaths).
- The winner captain and crew has a party, including a random number of rum :)
 */

public class Ship {

  String shipName;
  Pirate captain;
  List<Pirate> crew;
  int consumedRumByCaptain;
  int battleScore;

  public Ship(String nameYourShip) {
    this.shipName = nameYourShip;
    this.consumedRumByCaptain = (int)(1 + (Math.random()) * 5);
    this.fillShip();
  }

  public void fillShip() {
    this.captain = new Pirate();
    this.captain.drunkOMeter = this.consumedRumByCaptain;
    this.crew = new ArrayList<>();
    int recruitCrew = (int)(20 + (Math.random()) * 80);
    for (int i = 0; i < recruitCrew; i++) {
      crew.add(i, new Pirate());
    }
  }

  public void calculateBattleScore() {
    this.battleScore = crewStatus() - this.captain.drunkOMeter;
  }

  public int crewStatus() {
    int countAlive = 0;
    for (Pirate imAlive : this.crew) {
      if (!(imAlive.isDead)) {
        countAlive++;
      }
    }
    return countAlive;
  }

  public void shipStatus() {
    System.out.println(this.shipName + " Captain's Log: ");
    System.out.println(crewStatus() + " useless pig is still alive!");
    System.out.println("The Captain is " + this.captain.status() + " Had drunk "  + this.captain.drunkOMeter
            + " bottle of rum, so far.");
  }

  public boolean battle(Ship toBattleWith) {
    boolean battle = false;
    if (this.battleScore > toBattleWith.battleScore) {
      battle = true;
    }
    return battle;
  }

//  public void

}
