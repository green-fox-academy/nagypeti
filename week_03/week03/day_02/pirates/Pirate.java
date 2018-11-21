package day_02.pirates;

public class Pirate {

  int drunkOMeter;
  boolean passedOut;
  boolean isDead;

  public Pirate() {
    this.drunkOMeter = 0;
    this.passedOut = false;
    this.isDead = false;
  }

  public void drinkSomeRum() {
    if (this.isDead) {
      System.out.println("This f*cker is dead");
    } else if (this.passedOut) {
      this.drunkOMeter = 0;
      this.passedOut = false;
    } else {
      this.drunkOMeter++;
    }
  }

  public void howsItGoingMate() {
    if (this.drunkOMeter < 5) {
      System.out.println("Pour me anudder!");
      drinkSomeRum();
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.passedOut = true;
    }
  }

  public void die() {
    this.isDead = true;
  }

  public void brawl(Pirate pirateToFightWith) {
    int randomChance = (int) (1 + (Math.random() * 3));
    if (!(this.isDead | pirateToFightWith.isDead)) {
      if (randomChance == 1) {
        this.isDead = true;
      } else if (randomChance == 2) {
        pirateToFightWith.isDead = true;
      } else {
        this.passedOut = true;
        pirateToFightWith.passedOut = true;
      }
    }
  }

  public String status() {
    String passedOut = "";
    String deadOrAlive = "";

    if (this.isDead) {
      deadOrAlive = "dead!";
    } else {
      deadOrAlive = "alive";
      if (this.passedOut) {
        passedOut = " and passed out!";
      } else {
        passedOut = " and awake.";
      }
    }
    return deadOrAlive + passedOut;
  }

}
