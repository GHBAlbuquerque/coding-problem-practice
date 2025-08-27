package com.thecodinginterviewbootcamp.sessions._02palindrome;

// --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// --- Examples:
//   palindrome("abba") === true
//   palindrome("abcdefg") === false

public class Palindrome {

    public static Boolean palindrome(String s) {
        if(s == null) return false;

        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static Boolean palindromeSol2(String s) {
        if(s == null) return false;

        StringBuilder reversed = new StringBuilder();
        for(Character letter : s.toCharArray()) {
            reversed.insert(0, letter);
        }

        return reversed.toString().equals(s);
    }

    public static void main(String[] args) {
        // Test 1: palindrome function is defined
        if (palindrome("") != null) {
            System.out.println("Test 1 Passed: palindrome() is defined.");
        } else {
            System.out.println("Test 1 Failed: palindrome() returned null.");
        }

        // Test 2: "aba" is a palindrome
        System.out.println("Test 2: \"aba\" → " + palindrome("aba"));

        // Test 3: " aba" is not a palindrome
        System.out.println("Test 3: \" aba\" should be false → " + palindrome(" aba"));

        // Test 4: "aba " is not a palindrome
        System.out.println("Test 4: \"aba \" should be false → " + palindrome("aba "));

        // Test 5: "greetings" is not a palindrome
        System.out.println("Test 5: \"greetings\" should be false → " + palindrome("greetings"));

        // Test 6: "1000000001" a palindrome
        System.out.println("Test 6: \"1000000001\" → " + palindrome("1000000001"));

        // Test 7: "Fish hsif" is not a palindrome
        System.out.println("Test 7: \"Fish hsif\" should be false → " + palindrome("Fish hsif"));

        // Test 8: "pennep" a palindrome
        System.out.println("Test 8: \"pennep\" → " + palindromeSol2("pennep"));

        // Test 9: "vaca" is not a palindrome
        System.out.println("Test 9: \"vaca\" should be false → " + palindromeSol2("vaca"));
    }
}
