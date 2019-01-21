package day01.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class writeMultipleLines {

  public static void main(String[] args) {

    String myPath = "multiple_lines.txt";
    String myWord = "nyam";
    int randomNr = (int) (1 + (Math.random() * 10));

    writeToFile(myPath, myWord, randomNr);

    try {
      List<String> printOut = Files.readAllLines(Paths.get(myPath));
      for (String lines : printOut) {
        System.out.println(lines);
      }
    } catch (IOException err) {
      return;
    }
  }

  public static void writeToFile(String path, String word, int number) {
    List<String> newContent = new ArrayList<>();
    try {
      for (int i = 0; i < number; i++) {
        newContent.add(word);
      }
      Files.write(Paths.get(path), newContent);
    } catch (IOException exp) {
      return;
    }
  }
}
