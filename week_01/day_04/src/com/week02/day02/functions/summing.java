package com.week02.day02.functions;

public class summing {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

    public static int sum (int input) {

        int sumTotal = 0;

        for (int i = 0 ; i < input; i++) {
            sumTotal = sumTotal + i;
        }
        return sumTotal;
    }

    public static void main(String[] args) {

        int inputNr = 18;

        System.out.println(sum(inputNr));

    }
}
