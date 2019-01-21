package com.week02.day01.Loops;

import java.util.Scanner;
import com.week02.day01.Loops.drawPyramid;

public class drawDiamond {


    public static void drawInverzPyramid (int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                for (int k = 1; k < number - i; k++) {
                    System.out.print("*");
                }
                for (int l = 1; l <= number - i; l++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Give me a number and I draw you a diamond:");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println("Here's your diamond! :)");

        drawPyramid.drawPyramid(num);
        drawInverzPyramid(num);

    }
}



