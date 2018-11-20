package week04.day02.greenfoxorganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

  protected String name;
  protected List<Student> students;
  protected List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student newStudent) {
    students.add(newStudent);
  }

  public void addMentor(Mentor newMentor) {
    mentors.add(newMentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and "
            + mentors.size() + " mentors.");
  }

}
