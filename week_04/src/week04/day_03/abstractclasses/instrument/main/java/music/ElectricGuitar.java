package week04.day_03.abstractclasses.instrument.main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this(6);
  }

  public ElectricGuitar(int nrOfStrings) {
    this.numberOfStrings = nrOfStrings;
  }

  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println("Electric Guitar, a " + this.numberOfStrings
            + "-stringed instrument that goes " + this.sound());
  }

}
