package week04.day_03.abstractclasses.instrument.main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    this(4);
  }

  public Violin(int nrOfStrings) {
    this.numberOfStrings = nrOfStrings;
  }

  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println("Violin, a " + this.numberOfStrings
            + "-stringed instrument that goes " + this.sound());
  }

}


