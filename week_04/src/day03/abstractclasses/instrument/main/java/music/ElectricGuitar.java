package day03.abstractclasses.instrument.main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this(6);
  }

  public ElectricGuitar(int nrOfStrings) {
    this.numberOfStrings = nrOfStrings;
    this.name = "Electric Guitar";
  }

  public String sound() {
    return "Twang";
  }

}
