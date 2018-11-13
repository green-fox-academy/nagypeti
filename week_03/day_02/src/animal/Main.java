package animal;

public class Main {

  public static void main(String[] args) {

    Animal cow = new Animal();

    cow.eat();
    cow.drink();
    System.out.println("Hunger: " + cow.hunger + "\n" + "Thirst: " + cow.thirst);
    cow.eat();
    cow.drink();
    System.out.println("Hunger: " + cow.hunger + "\n" + "Thirst: " + cow.thirst);

    cow.play();
    cow.play();
    cow.play();
    System.out.println("Hunger: " + cow.hunger + "\n" + "Thirst: " + cow.thirst);

  }
}
