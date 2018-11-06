package com.week03.day02.strings;

public class urlFixer {

    public static String urlPreFixFixer (String wrongURL){

        if (wrongURL.startsWith("https//")){
            wrongURL = wrongURL.replaceFirst("https//", "https://");
        }

        return wrongURL;

    }

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        url = url.replace("bots", "odds");

        System.out.println(urlPreFixFixer(url));

    }
}
