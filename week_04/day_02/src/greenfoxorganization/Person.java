package greenfoxorganization;

public class Person {

  protected String name;
  protected String gender;
  protected int age;

  public Person() {
    this("Jane Doe", 30, "female");
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public void introduce() {
    System.out.print("Hi, I'm " + name + ", a " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println();
    System.out.println("My goal is: Live for the moment!");
  }

}
