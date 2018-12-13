package poker;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void checkHands() {
    assertEquals("White wins!", Main.checkHands("2H 3D 5S 9C KD", "2C 3H 4S 8C AH"));
  }

  @Test
  public void checkHands2() {
    assertEquals("Black wins!", Main.checkHands("2H 4S 4C 2D 4H", "2S 8S AS QS 3S"));
  }
}
