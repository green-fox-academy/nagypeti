package com.week03.day02.practice; // Packages are the collection of java classes

public class Human {

    // Object orientation!

    // Class
    // A general description of an object, a class can have many different objects created with the given
    // states as parameters
    // Classes can have multiple state (field or data), any state can have multiple behavior (method or subroutine)

    // Object
    // An instance of a class
    // Special method (constructor method) need to be summoned in a Class.
    // It is the method for define the Object (human), in java it's created by default


    // Instance variables (data or state)
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    // public Human (){} // Constructor method

    public static void speak (){
      System.out.println("I speak!");
    }
    public void eat () {
      System.out.println("I eat a cow");
    }
    public void walk () {
      System.out.println("I will walk five hundred miles, and I will walk five hundred more!");
    }

}
