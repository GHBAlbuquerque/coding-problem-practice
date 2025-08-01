package com.specifics.capitalOne._05balancedParentheses;

import java.util.*;

public class BalancedParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character parentheses : s.toCharArray()) {

            if (parentheses == '(' || parentheses == '{' || parentheses == '[') {
                stack.push(parentheses);
                continue;
            } else if (stack.isEmpty()) {
                return false;
            }else if (parentheses == ')') {
                if (stack.peek() != '(') return false;
                stack.pop();
            } else if (parentheses == '}') {
                if (stack.peek() != '{') return false;
                stack.pop();
            } else if (parentheses == ']') {
                if (stack.peek() != '[') return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(BalancedParentheses.isValid("[[[]]]{}"));
        System.out.println(BalancedParentheses.isValid("[[[{]]]{}"));
        System.out.println(BalancedParentheses.isValid("[[[{]]]{"));
    }
}