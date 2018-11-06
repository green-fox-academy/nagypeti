package com.week02.day01.Loops;

import java.util.Scanner;

public class drawTriangle {

     public static void drawTriangle (int inputNr){

         for (int i = 0; i < inputNr; i++) {
             for ( int j = 0; j <= i; j++) {
                 System.out.print("*");
             }
             System.out.println("");
         }
     }

    public static void main(String[] args) {

        System.out.println("Give me the height of your Triangle: ");

        Scanner input = new Scanner(System.in);

        int favNum = input.nextInt();

        drawTriangle(favNum);

    }
}
