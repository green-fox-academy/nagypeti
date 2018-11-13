package petrolstation;

public class Station {

  static int gasAmount;

  static void refill () {
    gasAmount = gasAmount - (Car.capacity);
    Car.gasAmount = Car.gasAmount + Car.capacity;
  }



}
