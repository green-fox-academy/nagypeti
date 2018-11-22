package day03.usinganinterface.implementcharsequence;

public class Shifter implements CharSequence {

  String anythingToShift;
  int nrOfShift;

  Shifter(String anythingToShift, int nrOfShift) {
    this.anythingToShift = anythingToShift;
    this.nrOfShift = nrOfShift;
  }

  @Override
  public int length() {
    return anythingToShift.length();
  }

  @Override
  public char charAt(int index) {
    return anythingToShift.charAt(index + nrOfShift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
