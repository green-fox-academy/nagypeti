package com.week03.day02.strings;

public class simpleReplace {

    public static void main(String... args) {

        String example = "In a dishwasher far far away";

        System.out.println(example.replace("dishwasher", "galaxy"));

        example = example.replace("dishwasher", "galaxy");

        // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
        // Please fix it for me!
        // Expected output: In a galaxy far far away

        System.out.print(example);

    }
}
