package week04.day02.aircraftcarrier;

public class Aircraft {

  private int baseDamage;
  private int maxAmmo;
  private int ammo;
  private String type;

  Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammo = 0;
  }

  public String getType() {
    return type;
  }

  protected void setType(String type) {
    this.type = type;
  }

  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + ammo + ", Base dmg: "
            + baseDamage + ", All dmg: " + (ammo * baseDamage);
  }

  public int fight() {
    int allDamage = this.ammo * this.baseDamage;
    this.ammo = 0;
    return allDamage;
  }

  public int refill(int fillAmmo) {
    int currentAmmo = this.ammo;
    this.ammo = this.maxAmmo;
    return fillAmmo - (this.maxAmmo - currentAmmo);
  }

}
