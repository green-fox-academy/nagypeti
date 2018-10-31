package com.week02.day01.Loops;

import java.util.Scanner;

public class drawPyramid {

    public static void main(String[] args) {

        System.out.println("What is your favourite number?");

        Scanner input = new Scanner(System.in);

        int favNum = input.nextInt();

        System.out.println("Here is a pyramid built from it!");

        for (int i = 0; i < favNum; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < favNum - i; j++) {
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
}

//public static void anotherPyramidDrawingMethod ()
//    Scanner input = new Scanner(System.in);
//
//        System.out.printf("Number: ");
//
//        int num = input.nextInt();
//
//        int i = 1;
//
//         String block = "*";
//
//            while (i < num){
//                    String tab="";
//                    for(int tabNum=0;tabNum<=(num-i);tabNum++){
//                        tab+=" ";
//                    }
//                    System.out.println(tab+block+tab);
//                    block+="**";
//                    i++;
//              }