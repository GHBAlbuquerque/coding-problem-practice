package com.thecodinginterviewbootcamp.sessions._07anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False
public class Anagrams {

    private static String cleanString(String s) {
        if(s == null) return null;
        return s.replaceAll("[^\\w]", "").toLowerCase();
        // removes special characters and spaces
    }

    public static Boolean anagrams(String a, String b) {
        if(a == null && b == null) return false;
        if(a == null || b == null) return false;

        String cleanedA = cleanString(a);
        String cleanedB = cleanString(b);
        if(cleanedA.length() != cleanedB.length()) return false;

        Map<Character, Integer> count = new HashMap<>();
        for(Character character : cleanedA.toCharArray()) {
            Integer current = count.get(character);
            if(current == null) {
                count.put(character, 1);
            } else {
                count.put(character, ++current);
            }
        }

        for(Character character : cleanedB.toCharArray()) {
            Integer current = count.get(character);
            if(current == null || current <= 0) {
                return false;
            } else {
                count.put(character, --current);
            }
        }

        return true;

        // if second string has MISSING LETTERS (not more), it will be a false positive.
        //return count.values().stream().filter(value -> value != 0).count() == 0;
    }

    public static void main(String[] args) {
        // "hello" is an anagram of "llohe"
        System.out.println("\"hello\" vs \"llohe\" should be true: " + anagrams("hello", "llohe"));

        // "hello" is an anagram of "sllohe"
        System.out.println("\"hello\" vs \"lloh\" should be false: " + anagrams("hello", "lloh"));

        // "Whoa! Hi!" is an anagram of "Hi! Whoa!"
        System.out.println("\"Whoa! Hi!\" vs \"Hi! Whoa!\" should be true: " + anagrams("Whoa! Hi!", "Hi! Whoa!"));

        // "One One" is not an anagram of "Two two two"
        System.out.println("\"One One\" vs \"Two two two\" should be false: " + anagrams("One One", "Two two two"));

        // "One one" is not an anagram of "One one c"
        System.out.println("\"One one\" vs \"One one c\" should be false: " + anagrams("One one", "One one c"));

        // "A tree, a life, a bench" is not an anagram of "A tree, a fence, a yard"
        System.out.println("\"A tree, a life, a bench\" vs \"A tree, a fence, a yard\" should be false: "
                + anagrams("A tree, a life, a bench", "A tree, a fence, a yard"));

        // Extra tests
        System.out.println("\"rail safety\" vs \"fairy tales\": should be true: " + anagrams("rail safety", "fairy tales"));
        System.out.println("\"RAIL! SAFETY!\" vs \"fairy tales\" should be true: " + anagrams("RAIL! SAFETY!", "fairy tales"));
        System.out.println("\"Hi there\" vs \"Bye there\" should be false: " + anagrams("Hi there", "Bye there"));
    }
}
