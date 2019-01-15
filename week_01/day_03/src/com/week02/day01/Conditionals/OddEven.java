package com.week02.day01.Conditionals;


import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        System.out.println("Give me a number and I tell you is it odd or even?");

        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();

        int div = nr % 2;

        if (div == 0) {
            System.out.println("Your choosen one is even! :)");
        } else {
            System.out.println("Your choosen one is odd! :/");
        }

    }

}
