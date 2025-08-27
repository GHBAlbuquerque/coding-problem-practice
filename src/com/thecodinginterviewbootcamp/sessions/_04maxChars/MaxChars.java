package com.thecodinginterviewbootcamp.sessions._04maxChars;

// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

// Common String Questions
// 1) What is the most common character in the String?
// 2) Does String A have the same characters as Stribg B (like anagram)?
// 3) Does the given String have any repeated characters in it?
// We are going to convert our String into a Map where the keys are the


import java.util.HashMap;
import java.util.Map;

public class MaxChars {

    public static String maxChars(String s) {
        if(s == null || s.equals("")) {
            return null;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(Character character : s.toCharArray()) {
            if(!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                int count = map.get(character);
                map.put(character, ++count);
            }
        }

        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(entry -> entry.getKey().toString())
                .orElse(null);
    }

    public static String maxCharsSol1(String s) {
        if(s == null || s.equals("")) {
            return null;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(Character character : s.toCharArray()) {
            if(!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                int count = map.get(character);
                map.put(character, ++count);
            }
        }

        Map.Entry<Character, Integer> max = map.entrySet().stream().findFirst().get();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max.getValue()) {
                max = entry;
            }
        }

        return max.getKey().toString();
    }

    public static void main(String[] args) {
        // Test 1: function exists
        if (maxChars("") != null) {
            System.out.println("Test 1 Passed: maxChars function exists.");
        } else {
            System.out.println("Test 1 Failed: maxChars returned null.");
        }

        // Test 2: Finds the most frequently used char
        System.out.println("Test 2a: maxChars(\"a\") → " + maxChars("a"));
        System.out.println("Test 2b: maxChars(\"abcdefghijklmnaaaaa\") → " + maxChars("abcdefghijklmnaaaaa"));

        // Test 3: Works with numbers in the string
        System.out.println("Test 3: maxChars(\"ab1c1d1e1f1g1\") → " + maxChars("ab1c1d1e1f1g1"));
    }
}
