package com.week02.day02.arrays.hardOnes;

public class palindromeBuilder {

//    StringDemo reversed a palindrome. Here, once again, is its listing:

    public class StringDemo {

        public static void main(String[] args) {

            String palindrome = "Dot saw I was Tod";
            int len = palindrome.length();
            char[] tempCharArray = new char[len];
            char[] charArray = new char[len];

            // put original string in an
            // array of chars
            for (int i = 0; i < len; i++) {
                tempCharArray[i] =
                        palindrome.charAt(i);
            }

            // reverse array of chars
            for (int j = 0; j < len; j++) {
                charArray[j] =
                        tempCharArray[len - 1 - j];
            }

            String reversePalindrome =
                    new String(charArray);
            System.out.println(reversePalindrome);

        }
    }


//    Running the program produces this output:
//
//    doT saw I was toD

}
