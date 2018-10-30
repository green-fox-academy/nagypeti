package com.week02.day02.materialPractice;

import java.util.Scanner;

public class methods {

    public static final int myNumber = 6;

    public static void main(String[] args) {

        while (true) {
            countToLimit();
        }

    }

    public static void countToLimit {

        Scanner userInput2 = new Scanner(System.in);

        System.out.println("Give me a number:");

        int limit2 = userInput2.nextInt();

        for (int i = 0; i < limit2; i++){
            System.out.println(i);
        }

    }

}
