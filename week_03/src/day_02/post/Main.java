package day_02.post;

public class Main {

  public static void main(String[] args) {

    PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt3 = new PostIt("yellow", "Superb", "green");

    System.out.println(postIt1.backgroundColor + " " + postIt1.textColor + " " + postIt1.text);
    System.out.println(postIt2.backgroundColor + " " + postIt2.textColor + " " + postIt2.text);
    System.out.println(postIt3.backgroundColor + " " + postIt3.textColor + " " + postIt3.text);

  }

}
