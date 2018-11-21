package week04.day_03.usinganinterface.cloneable;

import week04.day_03.usinganinterface.cloneable.Student;

public class Main {

  public static void main(String[] args) {

    Student john = new Student("John", 20, "male", "BME");

    Student johnTheClone = john.clone();
  }
  
}
