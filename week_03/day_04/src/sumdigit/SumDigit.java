package sumdigit;

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

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
