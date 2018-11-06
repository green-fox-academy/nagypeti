package com.week02.day02.lists;

import java.util.*;

public class candyShop {

    public static ArrayList sweets (ArrayList inputList){

        for (int i = 0; i < inputList.size(); i++) {
            Object toLook = inputList.get(i);
            if (toLook.equals(2)){
                inputList.set(i, "Croissant");
            } else if (toLook.equals(false)) {
                inputList.set(i, "Ice cream");
            }
        }
        return inputList;
    }


    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }
}
