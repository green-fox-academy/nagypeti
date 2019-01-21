package day02.gardenapplications;

public class Plants {

  String color;
  double waterLevel;
  double absorbEfficiency;
  double waterLevelMax;

  public void wateringPlant(double amountOfWater) {
    waterLevel += amountOfWater * absorbEfficiency;
  }

}
