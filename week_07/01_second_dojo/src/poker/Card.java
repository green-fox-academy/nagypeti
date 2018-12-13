package poker;

public class Card {

  int value;
  char color;

  public Card(String input) {
    this.value = checkValue(input);
    this.color = checkColor(input);
  }

  public static int checkValue(String input) {
    String s = input.substring(0, 1);
    switch (s) {
      case "A":
        return 14;
      case "K":
        return 13;
      case "Q":
        return 12;
      case "J":
        return 11;
      case "1":
        return 10;
    }
    return Integer.parseInt(s);
  }

  public static char checkColor(String input) {
    return input.charAt(input.length() - 1);
  }

  public int getValue() {
    return value;
  }

}
