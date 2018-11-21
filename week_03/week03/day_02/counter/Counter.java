package day_02.counter;

public class Counter {

  int counter;
  int resetPoint;

  public Counter() {
    this(0);
  }

  public Counter(int countToStart) {
    this.counter = countToStart;
    this.resetPoint = countToStart;
  }

  public void add(int addNumberToCounter) {
    this.counter += addNumberToCounter;
  }

  public void add() {
    this.counter++;
  }

  public int get() {
    return this.counter;
  }

  public void reset() {
    this.counter = this.resetPoint;
  }

}
