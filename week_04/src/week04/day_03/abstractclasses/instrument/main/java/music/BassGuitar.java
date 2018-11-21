package week04.day_03.abstractclasses.instrument.main.java.music;

public class BassGuitar extends StringedInstrument {

//  Duum-duum-duum

  public BassGuitar() {
    this(4);
  }

  public BassGuitar(int nrOfStrings) {
    this.numberOfStrings = nrOfStrings;
  }

  public String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println("Bass Guitar, a " + this.numberOfStrings
            + "-stringed instrument that goes " + this.sound());
  }

}
