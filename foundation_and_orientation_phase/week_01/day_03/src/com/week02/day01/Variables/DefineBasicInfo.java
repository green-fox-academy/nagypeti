package com.week02.day01.Variables;

public class DefineBasicInfo {

    public static void main(String[] args) {

        // Define several things as a variable then print their values

        // Your name as a string
        String fullName = "Peter Nagy";
        System.out.println("Your name is " + fullName);

        // Your age as an integer
        int age = 26;
        System.out.println("You're " + age + " years old");

        // Your height in meters as a double
        double height = 1.72;
        System.out.println("Your height is: " + height);

        // Whether you are married or not as a boolean
        boolean marrigeStatus = false;

        if (marrigeStatus) {
            System.out.println("Your married");
        } else {
            System.out.println("Your not married");
        }

    }
}
