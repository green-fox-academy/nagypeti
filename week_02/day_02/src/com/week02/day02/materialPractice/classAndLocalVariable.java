package com.week02.day02.materialPractice;

public class classAndLocalVariable {

    static double myPI = 3.14159; // It is a class variable - you can reach it globally!
                                  // Class variables can reached in any of the methods created

    static int randomNumber;      // Another class variable

    public static void main(String[] args) {

        addThem(1,2);

        System.out.println("Global " + myPI);

        System.out.println(getRandomNum());

    }

    // Creating a new method, which can be called anywhere
    public static int addThem (int a, int b) {

        double smallPI = 3.140;
        double myPI = 3.0; // It is a local variable - you can reach it locally

        System.out.println("Local " + myPI);

        return 1;

    }

    public static int getRandomNum () {

        randomNumber = (int) (Math.random() * 99);
        return randomNumber;

    }

}
