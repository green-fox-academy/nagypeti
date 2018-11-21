package day_04.sumdigit;

public class SumDigit {

  public static void main(String[] args) {

    System.out.println(sumDigit(5643));

  }

  public static int sumDigit(int sum) {
    if (sum < 1) {
      return 0;
    }
    return sum % 10 + sumDigit(sum / 10);
  }

}
