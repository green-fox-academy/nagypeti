package day_04.stringagainandagain;

public class String3 {

  public static void main(String[] args) {

    String inputString = "xxasdfjnijnijn";
    System.out.println(replaceAdjacent(inputString, inputString.length()));

  }

  public static String replaceAdjacent(String input, int length) {
    if (length > 1) {
      input = input.substring(0,length - 1).concat("*").concat(input.substring(length - 1));
      return replaceAdjacent(input, length - 1);
    }
    return input;
  }

}
