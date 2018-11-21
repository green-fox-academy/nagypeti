package day_04.fibonacci;

public class Fibonacci {

  public static void main(String[] args) {

    System.out.println(fibSeqCalculator(10));

  }
  public static int fibSeqCalculator(int inputNr) {
    if (inputNr <= 0) {
      return 0;
    } else if (inputNr == 1){
      return 1;
    } else {
      return fibSeqCalculator(inputNr - 1) + fibSeqCalculator(inputNr -2);
    }
  }
}
