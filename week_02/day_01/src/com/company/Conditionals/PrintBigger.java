package com.company.Conditionals;

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Give me two number and I tell you which one is bigger!");

        Scanner scanner = new Scanner(System.in);

        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();

        if (nr1 > nr2){
            System.out.println(nr1 + " is bigger!");
        } else {
            System.out.println(nr2 + " is bigger!");
        }

    }
}
