package day03.usinganinterface.compareable;

import day03.interfaces.printable.Printable;

public class Domino implements Comparable<Domino>, Printable {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino a) {
    if (a.right > this.left) {
      return -1;
    }
    return 1;
  }

  @Override
  public void printAllFields() {
    System.out.println(getRightSide() + getLeftSide());
  }
}
