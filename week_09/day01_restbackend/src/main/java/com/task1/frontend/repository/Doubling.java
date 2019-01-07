package com.task1.frontend.repository;

public class Doubling {

  private Integer received;
  private Integer result;

  public Doubling(Integer input) {
    this.received = input;
    this.result = input * 2;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
