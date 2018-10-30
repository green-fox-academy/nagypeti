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
            // printParams("first", "second", "third", "fourth")
            // ...

    public static void printParams (String... input){

        for (String element : input) {
            System.out.println(element);
        }

    }

    public static void main(String[] args) {

        printParams("asd","kasdasd","ortlkbfmkl");

    }
}
