package com.week02.day01.Loops;

public class drawTriangle {

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for ( int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
