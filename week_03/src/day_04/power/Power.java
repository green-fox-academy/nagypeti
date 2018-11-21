package day_04.power;

public class Power {

  public static void main(String[] args) {

    System.out.println(power(9,4));

  }

  public static int power(int num, int power) {
    if (power == 0) {
      return 1;
    }
    return num * power(num, power - 1);
  }

}
