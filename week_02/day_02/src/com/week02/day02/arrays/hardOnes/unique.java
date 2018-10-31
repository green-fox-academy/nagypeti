package com.week02.day02.arrays.hardOnes;

public class unique {

    public static int [] uniqueList (int [] inputList) {

        int [] dupliFreeList = new int [inputList.length];

        dupliFreeList[0] = inputList[0];

        int dupCounter = 0;

        for (int i = 0; i < inputList.length; i++) {
            for (int j = 0; j < dupliFreeList.length -1; j++) {
                if (dupliFreeList[j] == inputList[i]) {
                    dupCounter++;
                }
            }
        }
        return dupliFreeList;
    }

    public static void printList (int [] input) {

        for (int elements : input) {
            System.out.println(elements);
        }
    }

    public static void main(String[] args) {

        int [] listToSort = {1, 11, 34, 11, 52, 61, 1, 34};

        printList(uniqueList(listToSort));

    }
}
