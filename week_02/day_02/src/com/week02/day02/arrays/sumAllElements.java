package com.week02.day02.arrays;

public class sumAllElements {

        // - Create an array variable named `ai`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `ai`

    public static int sumListElements (int [] inputList){

        int sumTotal = 0;

        for (int i : inputList){
            sumTotal += i;
        }

        return sumTotal;

    }


    public static void main(String[] args) {

        int [] ai = {3, 4, 5, 6, 7};

        System.out.println(sumListElements(ai));

    }

}
