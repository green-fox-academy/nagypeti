package com.week03.day02.practice;

public class StaticMethod {

  public static void main(String[] args) {

    Human person1 = new Human(); // Creating new Object from a Class - Its going to call for the constructor method of
                                // the class, if its not defined
    person1.age = 17;
    person1.eyeColor = "blue";
    person1.heightInInches = 6;
    person1.name = "Bill";

    Human person2 = new Human();
    person2.age = 18;
    person2.eyeColor = "brown";
    person2.heightInInches = 7;
    person2.name = "July";

    Human.speak(); // Static methods can be only applied to classes

    person1.eat(); // Non-static methods can be called on every created object from that class objects
    person2.eat(); //




  }

}
