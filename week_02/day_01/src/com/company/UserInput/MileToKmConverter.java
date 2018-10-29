package com.company.UserInput;

import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("How much mile you want to convert?");

        Scanner scanner= new Scanner(System.in);

        int userInputInt = scanner.nextInt();

        double kmConverter = userInputInt * 1.60934;

        System.out.println("It is: " + kmConverter + " km !");

    }
}
