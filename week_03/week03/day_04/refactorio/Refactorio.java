package day_04.refactorio;

public class Refactorio {

  public static void main(String[] args) {

    System.out.println(refactor(5));

  }

  public static int refactor(int inputNr) {
    if (inputNr == 0) {
      return 1;
    }
    return inputNr * refactor(inputNr - 1);
  }

}
