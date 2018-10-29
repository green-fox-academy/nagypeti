package com.company.UserInput;

import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has

        System.out.println("Number of chikens: ");

        Scanner scanner= new Scanner(System.in);

        int nrChickens = scanner.nextInt();

        // The second represents the number of pigs owned by the farmer

        System.out.println("Number of pigs: ");

        int nrPigs = scanner.nextInt();

        // It should print how many legs all the animals have

        int chickenLegs = nrChickens * 2;
        int pigLegs = nrPigs * 4;
        int animalLegsSumm = chickenLegs + pigLegs;

        System.out.println("Your animals have " + animalLegsSumm + " legs!");

    }
}
