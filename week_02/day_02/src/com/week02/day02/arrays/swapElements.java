package com.week02.day02.arrays;

public class swapElements {

        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

    public static void swapper (String [] addArray, int indexOfFirstElement, int indexOfSecondElement) {

        String elementToSwap = addArray [indexOfFirstElement];
        addArray[indexOfFirstElement] = addArray[indexOfSecondElement];
        addArray[indexOfSecondElement] = elementToSwap;

    }

    public static void printList (String [] input) {

        for (String elements : input) {
            System.out.println(elements);
        }

    }

    public static void main(String[] args) {

        String [] abc = {"first", "second", "third"};

        swapper(abc, 0,2);
        printList(abc);


    }

}
