package day03.usinganinterface.cloneable;

public class Student extends Person implements java.lang.Cloneable {

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

  @Override
  public Student clone() {
    return new Student(this.name, this.age, this.gender, this.previousOrganization);
  }
}
