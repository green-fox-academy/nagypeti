package com.week02.day03;

import java.util.Scanner;

public class divideByZero {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a num.:");
    int divider = scanner.nextInt();

    try {
      int result = 10 / divider;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail"); // This line only runs if the input was 0
    }
  }
}
