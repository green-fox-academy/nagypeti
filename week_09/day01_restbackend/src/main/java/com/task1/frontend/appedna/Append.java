package com.task1.frontend.appedna;

public class Append {

  private String appended;

  public Append(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
