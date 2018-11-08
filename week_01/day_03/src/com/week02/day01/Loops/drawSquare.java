package com.week02.day01.Loops;

import java.util.Scanner;

public class drawSquare {

    public static void main(String[] args) {

        System.out.println("Give a number: ");
        
        Scanner input = new Scanner(System.in);
        int favNum = input.nextInt();
        drawSquare(favNum);

    }

    public static void drawSquare (int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == height - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
