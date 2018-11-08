package com.week02.day01.Loops;

import java.util.Scanner;

public class drawSquare {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        System.out.println("Give a number: ");

        Scanner input = new Scanner(System.in);

        int favNum = input.nextInt();

        drawSquare(favNum);

    }

    public static void drawSquare (int heightOfSquare) {

        String whiteSpace = " ";
        for (int i = 0; i < heightOfSquare; i++) {
            if (i == 0 || i == heightOfSquare - 1) {
                for (int j = 0; j < heightOfSquare; j++) {
                    System.out.print("%");
                }
            } else {
                System.out.print("%" + whiteSpace.repeat(heightOfSquare - 2) + "%");
            }
            System.out.println();
        }
    }
}
