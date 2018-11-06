package com.company.practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

    public static void main(String[] args) {

//      - The collections is dynamic (not fix sized, dont have to initialize te length of it)
//      like arrays

//      - Collections only use object (cant assign primitive types (int, double)
//      - Collections can contain any type of objects

        ArrayList anyObject = new ArrayList();

        ArrayList anyObjectCopy = new ArrayList();

        anyObjectCopy.addAll(anyObject);

//      Add all of objects from another arraylist

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

//      grades [i] == grades.get (i)

        grades.remove(1);

//      - Remove element in the specified index,
//      the coll. going to be resized automatically!

        anyObject.add(12, "New thingy");

//      - Add element to the arraylist

        anyObject.set(12, "Even newer thingy");

//      - Replace element in arraylist

        if (anyObject.contains('whatever')){
            System.out.println("Yes");
        }

        if (anyObject.containsAll(anyObjectCopy)){
            System.out.println("Everything in anyObjectCopy is in anyObjext");
        }

        if (anyObject.isEmpty()){
            System.out.println("The list is empty");
        }

//      - We can check if the arraylist contains a specific element,
//      or we can check if it matches all the element of another arraylist,
//      or we can check if the arraylist is empty or not
//      !all methods going to return a boolean value!


        Object [] moreObjects = new Object [4];
        moreObjects = anyObjectCopy.toArray();

        System.out.println(Arrays.toString(moreObjects));

//      We can export any arraylist into a simple array using .toArray function


    }
}
