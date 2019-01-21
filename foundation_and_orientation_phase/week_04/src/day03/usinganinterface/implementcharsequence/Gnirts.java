package day03.usinganinterface.implementcharsequence;

public class Gnirts implements CharSequence {

  String whatEver;

  Gnirts(String whatEver) {
    this.whatEver = whatEver;
  }

  @Override
  public int length() {
    return whatEver.length();
  }

  @Override
  public char charAt(int index) {
    return whatEver.charAt(length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

}
