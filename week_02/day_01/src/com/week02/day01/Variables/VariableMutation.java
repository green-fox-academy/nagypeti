package com.week02.day01.Variables;

public class VariableMutation {

    public static void main(String[] args) {

        // make the "a" variable's value bigger by 10

        int a = 3;

        System.out.println(a += 10);

        // make b smaller by 7

        int b = 100;

        System.out.println(b -= 7);

        // please double c's value

        int c = 44;

        System.out.println(c *= 2);

        // please divide by 5 d's value

        int d = 125;

        System.out.println(d /= 5);

        // please cube of e's value

        int e = 8;

        System.out.println(Math.pow(e,3));

        // tell if f1 is bigger than f2 (print as a boolean)

        int f1 = 123;
        int f2 = 345;

        boolean biggerThen1= f1 > f2;

        System.out.println(biggerThen1);

        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int g1 = 350;
        int g2 = 200;

        boolean biggerThen2 = g2 * 2 > g1;

        System.out.println(biggerThen2);

        // tell if it has 11 as a divisor (print as a boolean)

        int h = 135798745;
        int divisor11 = h % 11;

        System.out.println("Osztható 11-el?");

        boolean isItDividableWith11 = divisor11 == 0;

        System.out.println(isItDividableWith11);

        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        int i2Squared = i2 * i2;
        int i2Cubed = i2 * i2 * i2;

        boolean asd = i2Squared < i1  && i1 < i2Cubed;

        System.out.println(asd);

        // tell if j is dividable by 3 or 5 (print as a boolean)

        int j = 1521;
        int divisor3 = j % 3;
        int divisor5 = j % 5;



        //fill the k variable with its content 4 times

        String k = "Apple";
        String K4 = k + " " + k + " " + k + " " + k;

        System.out.println(K4);
    }
}
