package com.week02.day03.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class fileReader {

  public static void main(String[] args) {

//    OLDER version:
//    Scanner scanner = new Scanner(System.in);
//    File file = new File("day_01.iml");
//    System.out.println(file.exists());
//    System.out.println(file.canRead() + ", " + file.canWrite());
//
//    try {
//     Scanner scanner1 = new Scanner (file);
//     while (scanner1.hasNext()) {
//       System.out.println(scanner1.nextLine());
//     }
//     scanner.close();
//    } catch (IOException ex){ }

    Path path = Paths.get("com.week02.day01/practice/day_01.iml");      //This can be relative or absolute
    Files.isWritable(path);
    Files.isReadable(path);
    Files.isWritable(path);

    try{
      List<String> lines = Files.readAllLines(path);
      for (String line : Files.readAllLines(Paths.get("day_01.iml"))) {
        System.out.println(line);
      }
    } catch (IOException ex){
      ex.printStackTrace();
    }


  }
}
