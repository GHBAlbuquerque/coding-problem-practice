package com.thecodinginterviewbootcamp.sessions._11findTheVowels;

// --- Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', and 'u'.
// --- Examples
//   vowels('Hi There!') --> 3
//   vowels('Why do you ask?') --> 4
//   vowels('Why?') --> 0


import java.util.Set;

public class FindTheVowels {

    public static int vowels(String s) {
        if(s == null) return 0;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;

        for(Character letter : s.toLowerCase().toCharArray()) {
            if(vowels.contains(letter)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        // Test 1: vowels is a function
        System.out.println("vowels is a method: " + (FindTheVowels.class != null));
        System.out.println();

        // Test 2
        System.out.println("Expected: 5");
        System.out.println("Actual:   " + vowels("aeiou"));
        System.out.println();

        // Test 3
        System.out.println("Expected: 5");
        System.out.println("Actual:   " + vowels("AEIOU"));
        System.out.println();

        // Test 4
        System.out.println("Expected: 5");
        System.out.println("Actual:   " + vowels("abcdefghijklmnopqrstuvwxyz"));
        System.out.println();

        // Test 5
        System.out.println("Expected: 0");
        System.out.println("Actual:   " + vowels("bcdfghjkl"));
        System.out.println();

        // Test 6
        System.out.println("Expected: 4");
        System.out.println("Actual:   " + vowels("Why do you ask?"));
        System.out.println();
    }
}
