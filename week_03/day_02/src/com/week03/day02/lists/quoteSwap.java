package com.week03.day02.lists;

import java.util.*;

public class quoteSwap {

    public static ArrayList quoteSwap (ArrayList<String> inputList){

        ArrayList<String> swapped = inputList;

        String temp = swapped.get(2);
        swapped.set(2, swapped.get(5));
        swapped.set(5, temp);

        for (int i = 0; i < swapped.size() ; i++) {

        }
        return swapped;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }
}
