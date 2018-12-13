package poker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {

  List<Card> hand;
  int score;

  public Hand(String string) {
    hand = fillHand(string);
    this.score = 0;
  }

  public static ArrayList<Card> fillHand(String input) {
    ArrayList<Card> result = new ArrayList<>();

    String[] s = input.split(" ");
    for (int i = 0; i < s.length; i++) {
      result.add(new Card(s[i]));
    }
    return result;
  }

  public boolean isSameColor() {
    boolean b = true;
    for (Card card :
            hand) {
      if (hand.get(0).color != card.color) b = false;
    }
    return b;
  }

  public boolean isStraight() {
    boolean b = true;
    List<Card> sortedList = hand.stream()
            .sorted(Comparator.comparing(Card::getValue))
            .collect(Collectors.toList());
    for (int i = 0; i < sortedList.size() - 1; i++) {
      if (sortedList.get(i).value != sortedList.get(i + 1).value - 1) b = false;
    }
    return b;
  }

}
