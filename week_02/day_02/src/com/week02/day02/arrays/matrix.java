package com.week02.day02.arrays;

public class matrix {

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void printMAtrix (int[][] matrixToPrint){

        for (int i = 0; i < matrixToPrint.length; i++) {
            for (int j = 0; j < matrixToPrint.length; j++) {
                System.out.print(" " + matrixToPrint[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] myMatrix = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        printMAtrix(myMatrix);

    }
}
