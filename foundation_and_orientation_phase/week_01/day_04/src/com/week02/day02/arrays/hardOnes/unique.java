package com.week02.day02.arrays.hardOnes;

public class unique {

    public static int [] uniqueList (int [] inputList) {


        int uniqueCount = 0;

        int [] dupliFreeList = new int [inputList.length - uniqueCount];

        for (int i = 0; i < inputList.length; i++) {
            int thisInt = inputList[i];
            boolean notUnique = false;
            for (int j = 0; j < i; j++) {
                if (thisInt == inputList[j]) {
                    notUnique = true;
                }
            }
            if (!notUnique) {
                uniqueCount++;
            }
        }
        return dupliFreeList;
    }

    public static void printList (int [] inputList) {

        for (int elements : inputList) {
            System.out.println(elements);
        }
    }

    public static void main(String[] args) {

        int [] listToSort = {1, 11, 34, 11, 52, 61, 1, 34};

        printList(uniqueList(listToSort));

    }
}
