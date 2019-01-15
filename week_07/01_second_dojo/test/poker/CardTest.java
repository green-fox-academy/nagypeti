package poker;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

  @Test
  public void checkValue() {
    assertEquals(10, Card.checkValue("10H"));
  }


  @Test
  public void checkColor() {
    assertEquals('H', Card.checkColor("10H"));
  }
}
