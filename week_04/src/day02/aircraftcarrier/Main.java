package day02.aircraftcarrier;

public class Main {

  public static void main(String[] args) throws Exception{

    F16 f16One = new F16();

    System.out.println(f16One.refill(500));
    System.out.println(f16One.fight());
    System.out.println(f16One.getStatus());

  }
}
