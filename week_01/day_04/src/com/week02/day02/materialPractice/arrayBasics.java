package com.week02.day02.materialPractice;

public class arrayBasics {

    public static void main(String[] args) {

///!!!  // CREATING a new data type array. Example: int type array
        int bucky [] = new int [10]; //We declare how much element will be stored in the created array

        bucky [0] = 23;
        bucky [1] = 567;    //If want, we can index all the elements in the array
        // ...
        // ...
        bucky [9] = 90;

        System.out.println(bucky[1]);


///!!!  // We can INITIALIZE a new array, in this case the elements going to be auto indexed from left ro right

        int [] newArray = {2,3,4,5,6,7,8};

        System.out.println(newArray[0]);


        // We have to define the range of the array, its important because Java will know how much memory need to be reserved
        int [] practArray = new int [10];


        for (int i = 0; i < practArray.length; i++) {
            System.out.println(practArray[i]);
        }

///!!!  // We can go trough the elements of an array with a specific for loop:
        // The element is not a keyword, it is the name of the variable, it can be "cat" if you like

        for (int element : practArray) {
            System.out.println(element);
        }

///!!!  // Arrays are assigned to memory fields, because this feature the elements of the arrays can be rewritten
        // if the array is assigned to other array. In this example the 0 index element of myArray 1 going to be 7,
        // because we rewritten it in myArray2, which has the same memory field assigned.

        int [] myArray1 = {1, 2};
        int [] myArray2 = myArray1;
        myArray2 [0] = 7;


///!!!  // We can create multidimensional arrays (matrix - y and x axis creates the index for an element):

        int [][] myMatrix = {{1, 2}, {1, 2}};

        System.out.println(myMatrix[0][0]);
        System.out.println(myMatrix[1][0]);
        System.out.println(myMatrix[0][1]);
        System.out.println(myMatrix[1][1]);

        // Creating a new multi array with its size 10x10,  without giving it the values

        String [][] multiArray = new String[10][10];



    }

}
