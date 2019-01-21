package apples;

import day04.apples.Apple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleTest {

  @Test
  public void getAppleTest() {
    Apple testApple = new Apple();
    assertEquals("apple", testApple.getApple());
  }

}
