package com.week02.day02.lists;

import java.util.*;

public class quoteSwap {

//    public static String quoteSwap(ArrayList inputList){
//
//        inputList.add(inputList.indexOf("do"), "cannot");
//
//        inputList.remove(inputList.indexOf("do"));
//
//        inputList.add(inputList.lastIndexOf("cannot"), "do");
//
//        inputList.remove(inputList.lastIndexOf("cannot"));
//
//        String result = "";
//
//        for (String element : inputList) {
//            result = result + " " + element;
//        }
//
//        result = result.trim();
//
//        return result;
//    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
//        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }
}
