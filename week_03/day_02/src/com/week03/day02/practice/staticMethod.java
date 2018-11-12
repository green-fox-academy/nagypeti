package com.week03.day02.practice;

public class staticMethod {

  public static void main(String[] args) {

    Human person1 = new Human(); // Creating new Object from a Class
    person1.age = 17;
    person1.eyeColor = "blue";
    person1.heightInInches = 6;
    person1.name = "Bill";

    Human person2 = new Human();
    person2.age = 18;
    person2.eyeColor = "brown";
    person2.heightInInches = 7;
    person2.name = "July";

    Human.speak(); // static methods can be only applied to classes

    person1.eat(); // non static methods can be called on every created object from that class objects
    person2.eat(); //




  }

}
