package refactorio;

// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class Refactorio {

  public static void main(String[] args) {

    System.out.println(refactor(5));

  }

  public static int refactor(int inputNr) {
    if (inputNr == 0) {
      return 1;
    }
    return inputNr* refactor(inputNr-1);
  }
}
