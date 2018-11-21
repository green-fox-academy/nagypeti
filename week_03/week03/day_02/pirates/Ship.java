package day_02.pirates;

import java.util.ArrayList;
import java.util.List;

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
    System.out.println("The Captain is " + this.captain.status()
            + " Had drunk "  + this.captain.drunkOMeter
            + " bottle of rum, so far.");
  }

  public boolean battle(Ship toBattleWith) {
    boolean battle = false;
    if (this.battleScore > toBattleWith.battleScore) {
      battle = true;
    }
    return battle;
  }

}
