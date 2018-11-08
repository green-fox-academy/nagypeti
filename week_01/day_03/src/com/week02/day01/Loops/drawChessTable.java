package com.week02.day01.Loops;

public class drawChessTable {

    public static void main(String[] args) {

        drawChessBoard(8);

    }

    public static void drawChessBoard (int height ){

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height / 2; j++) {
                if (i % 2 == 0) {
                    System.out.print("% ");
                } else {
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}
