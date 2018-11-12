package com.week02.day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class printEachLine {

  public static void main(String[] args) {
    Path myFile = Paths.get("com/week02/day03/my-file.txt");
    try {
      List<String> allLines = Files.readAllLines(myFile);
      allLines.forEach(all -> System.out.println(all));
    } catch (IOException exp) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
