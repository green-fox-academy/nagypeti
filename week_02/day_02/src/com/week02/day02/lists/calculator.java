package com.week02.day02.lists;

import java.util.*;

public class calculator {
    
    public static void main(String[] args) {
        System.out.println(theBestCalculator(calcInput()));
    }
    
    public static String [] calcInput (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression in format: + 3 3 ");
        String userInput = scanner.nextLine();
        String [] output= userInput.split(" ");
        return output;
    }
    
    public static int theBestCalculator (String [] inputList) {
        String operator = inputList[0];
        int operand1 = Integer.parseInt(inputList[1]);
        int operand2 = Integer.parseInt(inputList[2]);
        int result = 0;
        switch (operator){
            case "/": result = operand1 / operand2;
                break;
            case "*":  result = operand1 * operand2;
                break;
            case "+":  result = operand1 + operand2;
                break;
            case "-":  result = operand1 - operand2;
                break;
        }
        return result;
    }
}
