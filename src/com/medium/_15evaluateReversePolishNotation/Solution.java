package com.medium._15evaluateReversePolishNotation;

import java.util.Stack;

public class Solution {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                Integer firstNumber = stack.pop();
                Integer secondNumber = stack.pop();

                switch(token) {
                    case "+" -> stack.push(secondNumber + firstNumber);
                    case "-" ->  stack.push(secondNumber - firstNumber);
                    case "*" -> stack.push(secondNumber * firstNumber);
                    case "/" -> stack.push(secondNumber / firstNumber);
                    default -> {}
                }
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String[] tokens = new String[] {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
