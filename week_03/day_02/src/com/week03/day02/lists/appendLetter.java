package com.week03.day02.lists;

import java.util.*;

public class appendLetter {

    public static List appendA (List inputList){

        ArrayList appendedList = new ArrayList();

        for (int i = 0; i < inputList.size(); i++) {
            appendedList.add(inputList.get(i) + "a");
        }

        return appendedList;
    }


    public static void main(String[] args) {

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
}
