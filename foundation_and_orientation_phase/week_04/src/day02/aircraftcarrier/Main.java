package day02.aircraftcarrier;

import java.util.concurrent.ExecutionException;

public class Main {

  public static void main(String[] args) throws Exception {

    F16 f16One = new F16();
    Carrier carrier = new Carrier(1000,3000);

    System.out.println(f16One.refill(500));
    System.out.println(f16One.fight());
    System.out.println(f16One.getStatus());

    try {
      carrier.fill();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
