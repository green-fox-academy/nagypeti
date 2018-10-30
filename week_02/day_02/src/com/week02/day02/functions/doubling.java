package com.week02.day02.functions;

public class doubling {

    public static int doubler (int a) {
        return a * 2;
    }

    public static void main(String[] args) {

        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`

        int baseNum = 123;

        System.out.println(doubler(baseNum));

    }
}
