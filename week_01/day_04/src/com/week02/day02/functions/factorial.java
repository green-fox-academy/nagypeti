package com.week02.day02.functions;

public class factorial {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

    public static int factorio (int nr) {

        int fact = 1;

        for(int i = 1; i <= nr; i++) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {

        int factNr = 8;

        System.out.println("Factorial of " + factNr + " is: " + factorio(factNr));

    }
}
