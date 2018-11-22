package day03.abstractclasses.instrument.main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    this(4);
  }

  public Violin(int nrOfStrings) {
    this.numberOfStrings = nrOfStrings;
    this.name = "Violin";
  }

  public String sound() {
    return "Screech";
  }

}


