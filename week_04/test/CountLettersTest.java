import day04.countletters.CountLetters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

  @Test
  void letterCounterTest() {
    CountLetters count = new CountLetters();
    count.letterCounter("parameter");
    assertEquals(2, (int) count.countedList.get('a'));
    assertEquals(2, (int) count.countedList.get('e'));
    assertEquals(2, (int) count.countedList.get('r'));
    assertEquals(1, (int) count.countedList.get('p'));
    assertEquals(1, (int) count.countedList.get('m'));
    assertEquals(1, (int) count.countedList.get('t'));
  }

}
