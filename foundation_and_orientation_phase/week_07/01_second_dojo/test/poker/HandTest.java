package poker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HandTest {

  @Test
  public void fillHand() {
    ArrayList<Card> asd = new ArrayList<>();
    asd.add(new Card("2C"));
    asd.add(new Card("3H"));
    asd.add(new Card("4S"));
    asd.add(new Card("10C"));
    asd.add(new Card("AH"));
    Assert.assertEquals(asd.get(3).value, Hand.fillHand("2C 3H 4S 10C AH").get(3).value);
  }

  @Test
  public void isSameColor() {
    Hand hand1 = new Hand("2C 3H 4S 10C AH");
    Assert.assertFalse(hand1.isSameColor());
  }

  @Test
  public void isSameColor2() {
    Hand hand2 = new Hand("2C 3C 4C 10C AC");
    Assert.assertTrue(hand2.isSameColor());
  }

  @Test
  public void isStraight() {
    Hand hand2 = new Hand("2C 3C 4C 10C AC");
    Assert.assertFalse(hand2.isStraight());
  }

  @Test
  public void isStraight2() {
    Hand hand2 = new Hand("3C 5C 4C 7C 6C");
    Assert.assertTrue(hand2.isStraight());
  }
}
