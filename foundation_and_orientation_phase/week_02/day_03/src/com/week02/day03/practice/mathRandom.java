package com.week02.day03.practice;

public class mathRandom {

    public static void main(String[] args) {

//      Math.random generates a double value number between 0 <= Math.random() < 1.0

        int randomTen = (int)(Math.random() * 10);

//      We can cast it to integer
//        - First we set the lower bound the random number (this case = 50)
//        - Then we set the end value (this case = 50)
//        - It means we can get a random number between 0-50 and 50-99
//          - a + (Math.random() * b) --> Returns a random number between a and a + b, excluding a + b
        int randomHundred = 50 + (int) (Math.random() * 50);

        System.out.println(randomTen);
        System.out.println(randomHundred);

    }

}
