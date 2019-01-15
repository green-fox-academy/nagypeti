package com.week02.day02.arrays;

public class incrementElement {

        //  Create an array variable named `t`
        //  with the following content: `[1, 2, 3, 4, 5]`
        //  Increment the third element
        //  Print the third element

    public static int elementIncrementer (int [] inputList, int indexOfElement){

        return inputList[indexOfElement]++;
    }

    public static void main(String[] args) {

        int [] t = {1, 2, 3, 4, 5};

        elementIncrementer(t,2);

        System.out.println(t[2]);

    }
}
