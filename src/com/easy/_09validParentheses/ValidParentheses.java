package com.easy._09validParentheses;

import java.util.*;

public class ValidParentheses {

    public static void testValidateParentheses(String s) {
        Boolean result = ValidParentheses.validateParentheses(s);
        System.out.printf("The result for string %s is %s \n", s, result);
    }

    public static Boolean validateParentheses(String s){
        if(s == null) return false;

        Stack<Character> stack = new Stack<>(); //pop push peel isEmpty size

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }

            if(stack.isEmpty()) return false;

            Character top = stack.peek();

            if(s.charAt(i) == ')') {
                if(top != '(')  return false;
            }

            if(s.charAt(i) == ']') {
                if(top != '[')  return false;
            }

            if(s.charAt(i) == '}') {
                if(top != '{')  return false;
            }

            stack.pop();
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses.testValidateParentheses("([{{()}}])");
    }
}