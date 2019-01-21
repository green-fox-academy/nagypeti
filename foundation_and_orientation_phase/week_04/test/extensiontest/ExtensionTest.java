package extensiontest;

import day04.extension.Extension;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
    assertEquals(10, extension.add(4, 6));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(15, extension.maxOfThree(8, 4, 15));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(4, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    assertEquals(8, extension.median(Arrays.asList(1,2,8,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}
