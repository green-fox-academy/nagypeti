package greenfoxorganization;

public class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public void introduce() {
    super.introduce();
    System.out.println(" who represents " + company + " and hired "
            + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }

}
