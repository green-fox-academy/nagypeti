package com.week02.day02.lists;

import java.util.*;

public class solarSystem {

    public static List putSaturn (List inputArrayList){

        if (inputArrayList.get(5) != "Saturn"){
            inputArrayList.add(5, "Saturn");
        }

        return inputArrayList;
    }

    public static void main(String[] args) {


        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    }
}
