package com.week02.day01.Loops;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        Random rand = new Random();

        int ranNum = rand.nextInt(50) + 1;

        System.out.println(ranNum);

        System.out.println("Guess a random number between 1-50:");

        int guessNr = scanner.nextInt();

        while (ranNum != guessNr){
            System.out.println("Guess again!");
        }

        System.out.println("Your guess is correct!");


    }


}
