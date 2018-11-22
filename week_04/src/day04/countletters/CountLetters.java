package day04.countletters;

import java.util.HashMap;

public class CountLetters {

  public HashMap<Character,Integer> countedList;

  public CountLetters() {
    countedList = new HashMap<>();
  }

  public HashMap<Character, Integer> letterCounter(String stringToCount) {

    String allLowerCase = stringToCount.toLowerCase();

    for (int i = 0; i < allLowerCase.length() ; i++) {
      if (countedList.containsKey(stringToCount.charAt(i))){
        countedList.put(stringToCount.charAt(i), countedList.get(stringToCount.charAt(i))+1);
      } else {
        countedList.put(stringToCount.charAt(i), 1);
      }

    }

    return countedList;
  }

}
