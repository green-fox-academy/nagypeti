package com.week02.day02.arrays;

public class appendA {

        // - Create an array variable named `animals`
        //   with the following content: `["koal", "pand", "zebr"]`
        // - Add all elements an `"a"` at the end

    public static void appendAToList (String [] input){

        for (int i = 0; i < input.length; i++) {
            input [i] += "a";
        }

    }

    public static void printList (String [] input) {

        for (String elements : input) {
            System.out.println(elements);
        }

    }

    public static void main(String[] args) {

        String [] animals = {"koal", "pand", "zebr"};

        appendAToList(animals);
        printList(animals);

    }

}
