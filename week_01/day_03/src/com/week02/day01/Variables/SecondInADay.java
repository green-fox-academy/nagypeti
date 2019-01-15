package com.week02.day01.Variables;

public class SecondInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int allHours = 24;
        int allMinutes = 60;
        int allSeconds = 60;

        int remHours = allHours - currentHours;
        int remMinutes = allMinutes - currentMinutes;
        int remSeconds = allSeconds - currentSeconds;

        int remHoursSec= remHours * 60 * 60;
        int remMinutesSec= remMinutes * 60;

        int remSecAll = remHoursSec + remMinutesSec + remSeconds;

        System.out.println("Your remaining time for the day: " + remHours + "h" + remMinutes + "m" + remSeconds + "s");
        System.out.println("Your remaining time for the day in seconds: " + remSecAll + "s");

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

    }
}
