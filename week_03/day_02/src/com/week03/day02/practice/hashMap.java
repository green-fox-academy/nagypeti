package com.week03.day02.practice;

import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {

//      - Initialize a new HashMap

        HashMap<Integer, String> daysOfTheWeek = new HashMap<>();

//      - Add new element to HashMap
//      - We give the key first, than we declare the value

        daysOfTheWeek.put(1, "Monday");
        daysOfTheWeek.put(2, "Tuesday");
        daysOfTheWeek.put(3, "Wednesday");
        daysOfTheWeek.put(4, "Thursday");
        daysOfTheWeek.put(5, "Friday");
        daysOfTheWeek.put(6, "Saturday");
        daysOfTheWeek.put(7, "Sunday");

//      - Get the element by the key given

        daysOfTheWeek.get(3);

    }
}
