package day02.blog;

public class Main {

  public static void main(String[] args) {

    BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum",
            "Lorem ipsum dolor sit amet.",
            "2000.05.04.");
    BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why",
            "A popular long-form, stick-figure-illustrated blog about almost everything.",
            "2010.10.10.");
    BlogPost blogPost3 = new BlogPost("William Turton",
            "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want "
                    + "to be the center of attention. When I asked to take\n\t "
                    + "this picture outside one of IBM’s New York City offices, he "
                    + "told me that he wasn’t really into the whole organizer\n\t profile thing.",
            "2017.03.28.");

    System.out.println(blogPost1.title + " titled by " + blogPost1.authorName
            + " posted at " + blogPost1.publicationDate + "\n\t- " + blogPost1.text);
    System.out.println(blogPost2.title + " titled by " + blogPost2.authorName
            + " posted at " + blogPost2.publicationDate + "\n\t- " + blogPost2.text);
    System.out.println(blogPost3.title + " titled by " + blogPost3.authorName
            + " posted at " + blogPost3.publicationDate + "\n\t- " + blogPost3.text);

  }

}
