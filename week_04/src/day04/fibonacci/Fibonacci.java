package day04.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


  public Fibonacci() {
  }

  public int calcFibNrAtGivenIndex(int inputNr) {

    if (inputNr <= 0) {
      return 0;
    } else if (inputNr == 1){
      return 1;
    } else {
      return calcFibNrAtGivenIndex(inputNr - 1) + calcFibNrAtGivenIndex(inputNr -2);
    }

  }







}
