package day01.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class countLines {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    Path source = Paths.get("my-file.txt");

    // Function One:
    try {
      List<String> lines = Files.readAllLines(source);
      int countLines = 0;
      for (String line : lines) {
        countLines++;
      }
      System.out.println("Number of Lines: " + countLines);
      System.out.println("Name of the file: " + source.getFileName());
    } catch (IOException exp) {
      System.out.println("0");
    }

    // Function Two:
    try {
      long lineCount = Files.lines(source).count();
      System.out.println("Number of Lines: " + lineCount);
      System.out.println("Name of the file: " + source.getFileName());
    } catch (IOException exp2) {
      System.out.println("0");
    }
  }
}
