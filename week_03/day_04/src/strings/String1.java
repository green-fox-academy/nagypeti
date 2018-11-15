package strings;

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {

  public static void main(String[] args) {

    String given = "xxxxXXXXxxxxBBBBAAAA";

    System.out.println(charChanger(given));

  }

  public static String charChanger(String input) {
    if (input.contains("x")) {
      return charChanger(input.replaceFirst("x", "y"));
    }
    return input;
  }
}
