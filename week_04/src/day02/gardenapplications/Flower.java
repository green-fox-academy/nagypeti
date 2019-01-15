package day02.gardenapplications;

public class Flower extends Plants {

  Flower(String color){
    this.color = color;
    this.waterLevel = 0;
    this.absorbEfficiency = 0.75;
    this.waterLevelMax = 5;
  }

}
