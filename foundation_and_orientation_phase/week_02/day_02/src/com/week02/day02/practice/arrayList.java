package com.week02.day02.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

    public static void main(String[] args) {
        
//      - ArrayLists are Java specific data structures, can be implement in other languages like basic arrays,
//      - Arrays are basic data structures in almost every languages

//      - The ArrayLists are dynamic (not fix sized, don't have to initialize the length of it)
//      like arrays

//      - ArrayLists only use object (cant assign primitive types (int, double)
//      - ArrayLists can contain any type of objects

        ArrayList <String> myFirstListInJava = new ArrayList ();


        myFirstListInJava.add(0, "Im the 0 index element");
        myFirstListInJava.add(1, "Im the 1 index element");
        myFirstListInJava.add(2, "Im the 2 index element");
        myFirstListInJava.add(10, "Im the 10 index element");
        myFirstListInJava.add(0, "Im going to be move to 0 index position");

        System.out.println(myFirstListInJava);

//      Add all of objects from another ArrayList

        ArrayList <String> myFirstListInJavaCopy = new ArrayList ();

        myFirstListInJavaCopy.addAll(myFirstListInJava);

        System.out.println(myFirstListInJavaCopy);

//      We can create any type of ArrayList <give the type between>
//      grades [i] == grades.get (i)

        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(90);
        grades.add(85);
        grades.add(30);

        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("Grade #%d == %d\n",i ,grades.get(i));
        }

        for (int gr : grades){
            System.out.println(gr);
        }

//      - Remove element in the specified index,
//      the coll. going to be resized automatically!

        grades.remove(1);

//      - Add element to the ArrayList

        myFirstListInJava.add(12, "New thingy");

//      - Replace element in ArrayList

        myFirstListInJava.set(12, "Even newer thingy");

//      - We can check if the ArrayList contains a specific element,
//      or we can check if it matches all the element of another ArrayList,
//      or we can check if the ArrayList is empty or not
//      !all methods going to return a boolean value!

        if (myFirstListInJava.contains("whatever")){
            System.out.println("Yes");
        }

        if (myFirstListInJava.containsAll(myFirstListInJavaCopy)){
            System.out.println("Everything in myFirstListInJavaCopy is in anyObjext");
        }

        if (myFirstListInJava.isEmpty()){
            System.out.println("The list is empty");
        }

//      We can export any ArrayList into a simple array using .toArray function

        Object [] moreObjects = new Object [10];
        moreObjects = myFirstListInJavaCopy.toArray();

        System.out.println(Arrays.toString(moreObjects));


    }
}


