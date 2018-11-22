package anagramtest;

import day04.anagram.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  @Test
  void isItAnagramTestTrue() {
    Anagram testAnagram = new Anagram();
    assertTrue(testAnagram.isItAnagram("dog","god"));
  }

  @Test
  void isItAnagramTestFalse() {
      Anagram testAnagram = new Anagram();
      assertFalse(testAnagram.isItAnagram("dogshit","god"));
  }

}
