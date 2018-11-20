package week04.day02.greenfoxorganization;

public class Mentor extends Person {

  private String level;

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name,age,gender);
    this.level = level;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

}
