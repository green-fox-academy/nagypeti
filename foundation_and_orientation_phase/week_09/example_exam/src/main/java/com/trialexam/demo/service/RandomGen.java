package com.trialexam.demo.service;

public class RandomGen {

  public static Long randFourDigitLong() {
    Long code = new Long((int)(Math.random() * 9000) + 1000);
    return code;
  }

}
