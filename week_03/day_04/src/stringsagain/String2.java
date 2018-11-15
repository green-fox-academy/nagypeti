package stringsagain;

// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {

  public static void main(String[] args) {

    String given = "xxxxXXXXxxxxBBBBAAAA";

    System.out.println(charRemover(given));

  }

  public static String charRemover(String input) {
    if (input.contains("x")) {
      return charRemover(input.replaceFirst("x", ""));
    }
    return input;
  }

}
