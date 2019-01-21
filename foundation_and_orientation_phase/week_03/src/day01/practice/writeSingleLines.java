package day01.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class writeSingleLines {

  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    List<String> content = new ArrayList<>();
    content.add("My name is Peter");
    try {
      Path source = Paths.get("my-file.txt");
      Files.write(source, content);
      System.out.println(Files.readAllLines(source));
    } catch (IOException exp) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
