package day01.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class logs {

  public static void main(String[] args) {
    Path log = Paths.get("log.txt");
    try {
      List<String> contentOfLog = Files.readAllLines(log);
      calculateGetPostRatio(contentOfLog);
      for (String item : findUniqueIp(contentOfLog)) {
        System.out.println(item);
      }
    } catch (IOException exp) {
      System.out.println("File read/write error");
    }
  }

  public static void calculateGetPostRatio(List<String> inputList) {
    int getCounter = 0;
    int postCounter = 0;
    for (String item: inputList) {
      if (item.contains("GET")) {
        getCounter++;
      } else if (item.contains("POST")) {
        postCounter++;
      }
    }
    System.out.println("GET | POST ratio: " + ((double) getCounter / (double) postCounter));
  }

  public static List<String> findUniqueIp(List<String> inputList) {
    List<String> sortIpFromInput = new ArrayList<>();
    ArrayList<String> resultList = new ArrayList<>();
    for (String sortIp : inputList) {
      String newIp = sortIp.substring(27, 38);
      sortIpFromInput.add(newIp);
    }
    for (String uniqueIp : sortIpFromInput) {
      if (!resultList.contains(uniqueIp)) {
        resultList.add(uniqueIp);
      }
    }
    return resultList;
  }
}
