package com.company.Conditionals;

public class ConditionalVariableMutation {

    public static void main(String[] args) {

//First task below

        // if a is even increment out by one
        double a = 24;
        int out = 0;

        double aIsEven = a % 2;

        if (aIsEven == 0){
            out ++;
        }

        System.out.println(out);

//Next task below

        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"

        int b = 13;
        String out2 = "";

        if (10 < b && b < 20) {
            out2 = "Sweet!";
        } else if (b < 10) {
            out2 = "Less!";
        } else if (b > 20) {
            out2 = "More!";
        }

        System.out.println(out2);

//Next task below

        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if (credits >= 50 && !isBonus){
            c -= 2;
        } else if (credits < 50 && !isBonus){
            c -= 1;
        } else if (isBonus == true){
        }

        System.out.println(c);

//Next task below

        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        int d = 8;
        int time = 120;
        String out3 = "";

        int div = d % 4;

        if (div == 0 && time < 200) {
            out3 = "check";
        } else if (time > 200){
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }

        System.out.println(out3);

    }
}
