package com.week03.day02.strings;

public class takesLonger {

    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote.indexOf('I'));

        String fixQuote = quote.substring(18, 24);
        fixQuote = fixQuote.replace(" ", " always takes longer than ");

        System.out.println(fixQuote);

        quote = quote.replace("It you", fixQuote);

        System.out.println(quote);

    }
}
