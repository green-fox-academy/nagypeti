package day02.farm;

import day02.animal.Animal;

import java.util.List;

public class Farm {

  List<Animal> animalsInTheFarm;

  private int freePlaces;

  public void breed() {
    if (freePlaces > 0) {
      animalsInTheFarm.add(new Animal());
    }
  }

  public void slaugther() {
    int hungerMax = 0;
    for (int i = 0; i < animalsInTheFarm.size(); i++) {
      if (animalsInTheFarm.get(i).hunger > hungerMax) {
        hungerMax = i;
      }
    }
    animalsInTheFarm.remove(hungerMax);
    freePlaces++;
  }




}
