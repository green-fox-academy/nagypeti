package com.week02.day01.Loops;

import java.util.Arrays;
import java.util.Scanner;

public class parametricAverage {

    public static void main(String[] args) {

        System.out.println(parametricAvrg(getNumbers()));

    }

    public static int [] getNumbers () {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Give me a number: ");
        int nrToAsk = scanner.nextInt();
        int [] numbersToWorkWith = new int [nrToAsk];
        System.out.println("Give me " + nrToAsk + " number:");
        for (int i = 0; i < nrToAsk; i++) {
            numbersToWorkWith[i] = scanner.nextInt();
        }
        return numbersToWorkWith;
    }
    public static String parametricAvrg (int [] inputArray) {
        int sum = 0;
        for (int j = 0; j < inputArray.length; j++) {
            sum += inputArray[j];
        }
        double parAverage = (double) sum / inputArray.length;
        String returnValue = "Sum: " + sum + ", Average: " + parAverage;
        return returnValue;
    }
}
