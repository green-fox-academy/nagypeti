package day04.sum;

import java.util.ArrayList;
import java.util.List;

public class SumList {

  public List<Integer> listToSum;

  public SumList() {
    listToSum = new ArrayList<>();
  }

  public int sum(List<Integer> sumValues) {
    int sumValue = 0;
    for (Integer value : sumValues) {
      sumValue += value;
    }
    return sumValue;
  }

}
