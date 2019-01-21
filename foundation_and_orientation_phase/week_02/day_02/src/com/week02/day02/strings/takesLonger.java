package com.week02.day02.strings;

public class takesLonger {

    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote.indexOf('I'));

        StringBuilder fixQuote = new StringBuilder(quote);

        fixQuote.insert(18, " always takes longer than ");



        System.out.println(quote);

    }
}
