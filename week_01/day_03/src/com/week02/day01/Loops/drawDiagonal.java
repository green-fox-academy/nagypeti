package com.week02.day01.Loops;

import java.util.Scanner;

public class drawDiagonal {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        System.out.println("Give a number: ");
        Scanner input = new Scanner(System.in);
        int favNum = input.nextInt();
        drawSquare(favNum);

    }

    public static void drawSquare (int height) {

        for (int i = 0; i < height; i++) {
                for (int j = 0; j < height; j++) {
                    if (i == 0 || i == height - 1 || i == j || j == 0 || j == height -1){
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }

}
