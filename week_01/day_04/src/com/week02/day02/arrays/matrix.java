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

    public static void fillMatrix (int [][] matrixToFill) {

        for (int i = 0; i < matrixToFill.length; i++) {
            for (int j = 0; j < matrixToFill.length; j++) {
                if (i == j) {
                    matrixToFill[i][j] += 1;
                }
            }
        }
    }

    public static void printMatrix (int[][] matrixToPrint){

        for (int i = 0; i < matrixToPrint.length; i++) {
            for (int j = 0; j < matrixToPrint.length; j++) {
                System.out.print(" " + matrixToPrint[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] myMatrixNew = new int[4][4];

        printMatrix(myMatrixNew);


        fillMatrix(myMatrixNew);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        printMatrix(myMatrixNew);

    }
}
