package greenfoxorganization;

public class Mentor extends Person {

  String level;

  public Mentor() {
    this("Jane Doe", 30, "female", "intermediate");
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.level = level;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old "
            + gender + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

}
