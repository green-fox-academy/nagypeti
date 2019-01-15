package com.task1.frontend.dountil;

public class DoUntilService {

  private Integer result;

  public DoUntilService() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public int sum(int number) {
    if (number == 0) {
      return 0;
    }
    return number + sum(number - 1);
  }

  public int factor(int number) {
    if (number == 0) {
      return 1;
    }
    return number * factor(number - 1);
  }

}
