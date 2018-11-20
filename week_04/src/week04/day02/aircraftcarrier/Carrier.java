package week04.day02.aircraftcarrier;

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

  public int calculateDamageOfCarrier() {
    int damageOfCarrier = 0;
    for (Aircraft aircraft : listOfAircaftsCarried) {
      damageOfCarrier += aircraft.getAmmo() * aircraft.getBaseDamage();
    }
    return damageOfCarrier;
  }

  public String getStatus() {
    return "HP: " + health + ", Aircraft count: " + listOfAircaftsCarried.size()
            + ", Ammo Storage: " + ammoStorage + ", Total dmg: " + calculateDamageOfCarrier();
  }

  public void fill() {
    if (ammoStorage == 0) {
      System.out.println("No more ammo in the Armory!");
    } else {
      for (Aircraft aircraft : listOfAircaftsCarried) {
        aircraft.refill(ammoStorage);
        ammoStorage = ammoStorage - (ammoStorage - aircraft.refill(ammoStorage));
      }
    }
  }

  public void fight(Carrier fightWith) {
    fightWith.health -= this.calculateDamageOfCarrier();
  }

}
