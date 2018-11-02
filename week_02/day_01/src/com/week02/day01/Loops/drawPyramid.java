package com.week02.day01.Loops;


import java.util.Scanner;

public class drawPyramid {

    public static void drawPyramid (int inputNr) {

        for (int i = 0; i < inputNr; i++) {
            for (int j = 1; j < inputNr - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        System.out.println("Give me the number of levels of your pyramid we going to build: ");

        Scanner input = new Scanner(System.in);

        int favNum = input.nextInt();

        System.out.println("Here is a pyramid built from it!");

        drawPyramid(favNum);

    }
}