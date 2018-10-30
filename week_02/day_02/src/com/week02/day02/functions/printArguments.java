package com.week02.day02.functions;

public class printArguments {

            //  Create the usual class wrapper
            //  and main method on your own.

            // - Create a function called `printParams`
            //   which prints the input String parameters
            // - It can have any number of parameters

            // Examples
            // printParams("first")
            // printParams("first", "second")
            // printParams("first", "second", "third", "fourh")
            // ...

    public static String printParams (String... input){

        String allInput = "";

        for (int i = 0; i < input.length; i++)
            allInput += input;

        return allInput;

    }

    public static void main(String[] args) {

        System.out.println(printParams("asd","kasdasd","ortlkbfmkl"));

    }
}
