package day01.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class copyFile {

  public static void main(String[] args) {

    String fileToCopy = "file.txt";
    String copyInto = "copyOfFile.txt";
    String contentToFillIn = "I want to copy this line into another file";

    try {
      Files.write(Paths.get(fileToCopy), contentToFillIn.getBytes());
    } catch (IOException exp1) {
      return;
    }

    System.out.println(copyFileIntoAnother(fileToCopy, copyInto));

  }

  public static boolean copyFileIntoAnother(String path1, String path2) {

    Path wantToCopy = Paths.get(path1);
    Path copyIntoNewFile = Paths.get(path2);

    try {
      List<String> content = Files.readAllLines(wantToCopy);
      Files.write(copyIntoNewFile, content);
      return true;
    } catch (IOException exp) {
      return false;
    }

  }
}
