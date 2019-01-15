package day02.gardenapplications;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plants> listOfPlants;

  public Garden() {
    listOfPlants = new ArrayList<>();
  }

  public int sumPlantNeedsWater() {

    int needsWater = 0;

    for (Plants plant : listOfPlants) {
      if (plant.waterLevel < plant.waterLevelMax) {
        needsWater++;
      }
    }

    return needsWater;
  }

  public void wateringPlants(int waterWithAmount) {

    waterWithAmount /= sumPlantNeedsWater();

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
      if (plant.waterLevel < plant.waterLevelMax) {
        System.out.println("The " + plant.color + " "
                + plant.getClass().getSimpleName().toLowerCase() + " needs water.");
      } else {
        System.out.println("The " + plant.color + " "
                + plant.getClass().getSimpleName().toLowerCase() + " doesn't needs water.");
      }
    }

  }

}
