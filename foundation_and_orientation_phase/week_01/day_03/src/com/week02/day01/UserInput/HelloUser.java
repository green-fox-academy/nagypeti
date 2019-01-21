package com.week02.day01.UserInput;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Add meg a neved:");

        Scanner scanner= new Scanner(System.in);

        String userInput1 = scanner.nextLine();

        System.out.println("Hello, " + userInput1 + "!");

    }
}
