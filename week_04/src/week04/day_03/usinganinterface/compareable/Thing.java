package week04.day_03.usinganinterface.compareable;

public class Thing implements Comparable<Thing> {

  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing o) {
    if (o.completed != this.completed) {
      if (this.completed) {
        return -1;
      }
      return 1;
    }
    return this.name.compareTo(o.name);
  }

}

