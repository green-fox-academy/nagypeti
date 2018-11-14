package dominoes;

import java.util.*;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoOrganizer(dominoes));
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

  public static List<Domino> dominoOrganizer (List<Domino> inputList) {

    List<Domino> organizedDominoes = new ArrayList<>();
    organizedDominoes.add(inputList.get(0));

    int j = 0;
    while (organizedDominoes.size() < inputList.size()) {
      for (int i = 0; i < inputList.size(); i++) {
        if (organizedDominoes.get(j).getRightSide() == inputList.get(i).getLeftSide()) {
          organizedDominoes.add(inputList.get(i));
          j++;
        }
      }
    }

    return organizedDominoes;
  }
}
