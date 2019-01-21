package day02.aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> listOfAircaftsCarried;
  private int ammoStorage;
  private int health;

  Carrier(int ammoToFill, int maxHealth) {
    listOfAircaftsCarried = new ArrayList<>();
    this.ammoStorage = ammoToFill;
    this.health = maxHealth;
  }

  public void add(Aircraft aircraftToAdd) {
    listOfAircaftsCarried.add(aircraftToAdd);
  }

  public int getOverallDamage() {
    int overallDamage = 0;
    for (Aircraft aircraft : listOfAircaftsCarried) {
      overallDamage += aircraft.getCurrentAmmo() * aircraft.getBaseDamage();
    }
    return overallDamage;
  }

  public String getStatus() {
    return "HP: " + health
            + ", Aircraft count: " + listOfAircaftsCarried.size()
            + ", Ammo Storage: " + ammoStorage
            + ", Total dmg: " + getOverallDamage();
  }

  public void fill() throws Exception {
    if (ammoStorage <= 0) {
      throw new Exception("Not enough ammo in the Armory!");
    } else {
      for (Aircraft aircraft : listOfAircaftsCarried) {
        if (aircraft.isPriority()) {
          aircraft.refill(ammoStorage);
          ammoStorage = ammoStorage - (ammoStorage - aircraft.refill(ammoStorage));
        }
      }
      for (Aircraft aircraft : listOfAircaftsCarried) {
        aircraft.refill(ammoStorage);
        ammoStorage = ammoStorage - (ammoStorage - aircraft.refill(ammoStorage));
      }
    }
  }

  public void fight(Carrier fightWith) {
    fightWith.receiveAttack(this.getOverallDamage());
  }

  public void receiveAttack(int damage) {
    this.health -= damage;
  }

}
