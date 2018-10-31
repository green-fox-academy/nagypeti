package com.week02.day01.Loops;

import java.util.Scanner;

public class drawDiamond {

    public static void drawPyramid(int number) {

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < number - i; j++) {
                    if (j % 2 != 0) {
                        System.out.print(" ");
                    }
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void drawInverzPyramid (int number){

        for (int i = number; i >= 0; --i) {
            if (i % 2 == 0) {
                for (int j = number - number/2 - 1; j > i / 2; --j) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                }
                System.out.println("");
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("Give me an odd number:");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println("Here is a diamond built from it!");

        drawPyramid(num);
        drawInverzPyramid(num);


    }
}



