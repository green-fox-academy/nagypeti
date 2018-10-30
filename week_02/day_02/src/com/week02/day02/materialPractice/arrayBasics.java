package com.week02.day02.materialPractice;

public class arrayBasics {

    public static void main(String[] args) {

        //Creating a new int type array.
        int bucky [] = new int [10];
                            //We declare how much element will be stored in the created array
        bucky [0] = 23;
        bucky [1] = 567;
        // ...
        // ...
        bucky [9] = 90;

        //If want, we can index all the elements in the array

        System.out.println(bucky[1]);


        //We can initialize a new array, in this case the elements going to be auto indexed from left ro right

        int newArray [] = {2,3,4,5,6,7,8};

        System.out.println(newArray[0]);


        int practArray [] = new int [10];

        for (int j = 0; j < practArray.length; j++) {
            System.out.println("| " + j + " ");
        }
        System.out.println("|");


        //We can create multidimensional arrays:

        String [][] multiArray = new String[10][10];


    }

}
