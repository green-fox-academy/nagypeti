package gardenapplications;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Flower> listOfFlowers;
  List<Tree> listOfTrees;
  String color;
  double waterLevel;


  Garden() {
    listOfFlowers = new ArrayList<>();
    listOfTrees = new ArrayList<>();
  }

  public void wateringPlants(int waterWithAmount) {

    waterWithAmount = waterWithAmount / listOfTrees.size() + listOfFlowers.size();

    for (Flower flower : listOfFlowers) {
      if (flower.waterLevel < 5) {
        flower.waterLevel = waterWithAmount * 0.75 ;
      }
    }
    for (Tree tree : listOfTrees) {
      if (tree.waterLevel < 10) {
        tree.waterLevel = waterWithAmount * 0.4 ;
      }
    }

  }

  public void getGardenStatus() {
    for (Flower flower : listOfFlowers) {
      if (flower.waterLevel < 5) {
        System.out.println("The " + flower.color + " needs water.");
      } else {
        System.out.println("The " + flower.color + " doesn't needs water.");
      }
    }
    for (Tree tree : listOfTrees) {
      if (tree.waterLevel < 10) {
        System.out.println("The " + tree.color + " needs water.");
      } else {
        System.out.println("The " + tree.color + " doesn't needs water.");
      }
    }

  }

}
