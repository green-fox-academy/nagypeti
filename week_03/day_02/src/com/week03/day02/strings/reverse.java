package com.week03.day02.strings;

public class reverse {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        StringBuilder reverseReversed = new StringBuilder(reversed);

        reverseReversed.reverse();

        reversed = reverseReversed.toString();

        System.out.println(reversed);

    }

}
