package week04.day02.gardenapplications;

public class Main {

  public static void main(String[] args) {

    Garden myGarden = new Garden();

    myGarden.listOfPlants.add(new Flower("yellow"));
    myGarden.listOfPlants.add(new Flower("blue"));
    myGarden.listOfPlants.add(new Tree("purple"));
    myGarden.listOfPlants.add(new Tree("orange"));

    myGarden.getGardenStatus();
    myGarden.wateringPlants(40);
    myGarden.getGardenStatus();
    myGarden.wateringPlants(70);
    myGarden.getGardenStatus();

  }

}
