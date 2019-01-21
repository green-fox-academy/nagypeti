package day03.abstractclasses.instrument.main.java.music;

public abstract class StringedInstrument implements Instrument {

  private String name;
  protected int numberOfStrings;

  public void setName(String name) {
    this.name = name;
  }

  public abstract String sound();

  public void play() {
    System.out.println(name + ", a " + numberOfStrings
            + "-stringed instrument that goes " + sound());
  }

}
