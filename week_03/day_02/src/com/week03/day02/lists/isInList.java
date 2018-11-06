package com.week03.day02.lists;

import java.lang.reflect.Array;
import java.util.*;

public class isInList {
    public static void checkNums (ArrayList inputList){

        ArrayList<Integer> listToCheck = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));

        if (inputList.containsAll(listToCheck)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }
}
