package day04.extension;

import java.util.Arrays;
import java.util.List;

public class Extension {

  public int add(int a, int b) {
    return a + b;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > c){
      return b;
    }
    return c;
  }

  public double median(List<Integer> pool) {
    if (pool.size() % 2 == 0) {
      return (double) (pool.get((pool.size()/2)) + pool.get(((pool.size()/2) + 1))) / 2 ;
    } else {
      return pool.get((pool.size()/2));
    }
  }

  public boolean isVowel(char c) {
    return Arrays.asList('a', 'e', 'i', 'o', 'u').contains(c);
  }

  public String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}
