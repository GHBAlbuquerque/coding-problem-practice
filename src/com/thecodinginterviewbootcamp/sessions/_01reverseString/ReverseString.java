package com.thecodinginterviewbootcamp.sessions._01reverseString;

// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

// Good to know!
// StringBuilder has a "reverse" built in function. new StringBuilder(s).reverse().toString()
// StringBuilder can prepend values with stringBuilder.insert(0, yourString)

public class ReverseString {

    public static String reverseString(String s) {
        if(s == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverseStringSol2(String s) {
        if (s == null) {
            return null;
        }

        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseStringSol3(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder();

        for(Character character : s.toCharArray()) {
            reversed.insert(0, character);
        }

        return reversed.toString();
    }


    public static void main(String[] args) {
        // Test 1: Reverse function exists
        if (reverseString("") != null) {
            System.out.println("Test 1 Passed: reverseString is defined.");
        } else {
            System.out.println("Test 1 Failed: reverseString returned null.");
        }

        // Test 2: Reverse reverses a string
        String input1 = "abcd";
        String expected1 = "dcba";
        if (reverseString(input1).equals(expected1)) {
            System.out.println("Test 2 Passed.");
        } else {
            System.out.println("Test 2 Failed: expected " + expected1 + " but got " + reverseString(input1));
        }

        // Test 3: Reverse reverses a string with spaces
        String input2 = "  abcd";
        String expected2 = "dcba  ";
        if (reverseString(input2).equals(expected2)) {
            System.out.println("Test 3 Passed.");
        } else {
            System.out.println("Test 3 Failed: expected " + expected2 + " but got " + reverseString(input2));
        }


        // Test 4: Reverse reverses a string
        String input4 = "abcd";
        String expected4 = "dcba";
        if (reverseStringSol3(input1).equals(expected1)) {
            System.out.println("Test 3 Passed with Sol3.");
        } else {
            System.out.println("Test 3 Failed with Sol3: expected " + expected1 + " but got " + reverseStringSol3(input1));
        }

    }

}
