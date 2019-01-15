package day04.anagram;

import java.util.Arrays;

public class Anagram {

  public boolean isItAnagram(String one, String two) {

    char [] oneToChar = one.toCharArray();
    char [] twoToChar = two.toCharArray();

    Arrays.sort(oneToChar);
    Arrays.sort(twoToChar);

    return Arrays.equals(oneToChar,twoToChar);
  }

}
