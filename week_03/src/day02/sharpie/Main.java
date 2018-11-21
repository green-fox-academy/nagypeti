package day02.sharpie;

public class Main {

  public static void main(String[] args) {

    Sharpie boat = new Sharpie("blue", 2.0f);

    boat.use();
    boat.use();
    boat.use();

    System.out.println(boat.inkAmount);

  }
}
