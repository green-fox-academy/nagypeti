package day02.gardenapplications;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plants> listOfPlants;

  public Garden() {
    listOfPlants = new ArrayList<>();
  }

  public void wateringPlants(int waterWithAmount) {

    int needsWater = 0;

    for (Plants plant : listOfPlants) {
      if (plant.waterLevel < plant.waterLevelMax) {
        needsWater++;
      }
    }

    waterWithAmount = waterWithAmount / needsWater;

    for (Plants plant : listOfPlants) {
      if (plant instanceof Flower && plant.waterLevel < plant.waterLevelMax) {
        plant.wateringPlant(waterWithAmount);
      } else if (plant.waterLevel < plant.waterLevelMax) {
        plant.wateringPlant(waterWithAmount);
      }
    }

  }

  public void getGardenStatus() {

    for (Plants plant : listOfPlants) {
      if (plant instanceof Flower && plant.waterLevel < plant.waterLevelMax) {
        System.out.println("The " + plant.color + " flower needs water.");
      } else if (plant instanceof Tree && plant.waterLevel < plant.waterLevelMax){
        System.out.println("The " + plant.color + " tree needs water.");
      } else if (plant instanceof Flower && plant.waterLevel > plant.waterLevelMax) {
        System.out.println("The " + plant.color + " flower doesn't needs water.");
      } else {
        System.out.println("The " + plant.color + " tree doesn't needs water.");
      }
    }

  }

}
