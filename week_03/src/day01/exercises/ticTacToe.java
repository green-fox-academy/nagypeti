package day01.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ticTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    System.out.println(ticTacResult("win-o.txt"));
    // Should print "O"

    System.out.println(ticTacResult("win-x.txt"));
    // Should print "X"

    System.out.println(ticTacResult("draw.txt"));
    // Should print "Draw"

  }

  public static char ticTacResult(String fileName) {

    Path input = Paths.get(fileName);
    char[][] ticTacField = new char[3][3];
    char winner = ' ';

    try {
      List<String> ticTacIn = Files.readAllLines(input);
      for (int i = 0; i < ticTacField.length; i++) {
        for (int j = 0; j < ticTacField.length; j++) {
          ticTacField[i][j] = ticTacIn.get(i).charAt(j);
        }
      }
    } catch (IOException exp) {
      System.out.println("File read/write error");
    }

    for (int i = 0; i < ticTacField.length; i++) {
      if (ticTacField[i][0] == ticTacField[i][1] && ticTacField[i][0] == ticTacField[i][2]) {
        winner = ticTacField[i][0];
      } else if (ticTacField[0][i] == ticTacField[1][i] && ticTacField[0][i] == ticTacField[2][i]) {
        winner = ticTacField[0][i];
      } else if (ticTacField[0][0] == ticTacField[1][1] && ticTacField[1][1] == ticTacField[2][2]) {
        winner = ticTacField[1][1];
      } else if (ticTacField[2][0] == ticTacField[1][1] && ticTacField[1][1] == ticTacField[0][2]) {
        winner = ticTacField[1][1];
      }
    }
    if (winner == ' ') {
      return 'D';
    }
    return winner;
  }
}
