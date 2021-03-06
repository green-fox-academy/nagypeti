package day02.greenfoxorganization;

public class Student extends Person {

  private String previousOrganization = "The School of Life";
  private int skippedDays = 0;

  public Student() {
    super();
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" from " + previousOrganization + " who skipped "
            + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

}
