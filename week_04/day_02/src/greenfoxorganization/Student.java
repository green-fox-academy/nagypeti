package greenfoxorganization;

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student() {
    this("Jane Doe", 30, "female", "The School of Life");
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender
            + " from " + previousOrganization + " who skipped " + skippedDays
            + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

}
