package com.week02.day01.UserInput;

import java.util.Scanner;

public class AvarageOfInput {

    public static void main(String[] args) {

        System.out.println("Give five nr. to get the average of them:");

        Scanner scanner = new Scanner(System.in);

        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();
        int nr3 = scanner.nextInt();
        int nr4 = scanner.nextInt();
        int nr5 = scanner.nextInt();

        int sum = nr1 + nr2 + nr3 + nr4 + nr5;
        int average = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

    }
}
