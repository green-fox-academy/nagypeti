package com.week02.day02.arrays;

public class reverseList {

        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

    public static void reverseList (int[] inputList) {

        for (int i = 0; i < inputList.length / 2; i++) {
            int temporary = inputList[i];
            inputList[i] = inputList[inputList.length - 1 - i];
            inputList[inputList.length - 1 - i] = temporary;
        }
    }

    public static void printList (int [] inputList) {

        for (int element : inputList) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        int [] aj = {3, 4, 5, 6, 7};

        reverseList(aj);

        printList(aj);

    }

}
