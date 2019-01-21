package day03.abstractclasses.instrument.main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this(4);
  }

  public BassGuitar(int nrOfStrings) {
    this.numberOfStrings = nrOfStrings;
    this.setName("Bass Guitar");
  }

  public String sound() {
    return "Duum-duum-duum";
  }

}
