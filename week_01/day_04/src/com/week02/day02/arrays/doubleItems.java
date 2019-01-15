package com.week02.day02.arrays;

public class doubleItems {

        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array

    public static void doubleList (int [] input){

        for(int i = 0; i < input.length; i++) {
            input [i] = input [i] * 2;
        }
    }

    public static void printList (int [] input) {

        for (int elements : input) {
            System.out.println(elements);
        }
    }

    public static void main(String[] args) {

        int [] numList = {3, 4, 5, 6, 7};

        doubleList(numList);
        printList(numList);

    }
}
