package com.week02.day01.Loops;

import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        System.out.println("Give me two numbers: ");

        Scanner scanner= new Scanner(System.in);

        int firstNr = scanner.nextInt();
        int secondNr = scanner.nextInt();

        if (firstNr > secondNr) {
            System.out.println("The second number should be bigger");
        } while (firstNr <= secondNr) {
            System.out.println(firstNr++);
        }
    }
}
