package pirates;

/*
1, drinkSomeRum() - intoxicates the Pirate some
2, howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
3, die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
4, brawl(x) - where pirate fights another pirate (if that other pirate is alive)
and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
*/

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
