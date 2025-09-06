package com.thecodinginterviewbootcamp.sessions._08capitalize;

// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize('a short sentence') --> 'A Short Sentence'
//   capitalize('a lazy fox') --> 'A Lazy Fox'
//   capitalize('look, it is working!') --> 'Look, It Is Working!'


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Capitalize {

    public static String capitalize(String s){
        if(s == null || s.isBlank()) return null;

        String[] splited = s.split(" ");
        List<String> capitalized = new ArrayList<>();

        for(String word : splited) {
            String first = String.valueOf(word.charAt(0)).toUpperCase();
            capitalized.add(new StringBuilder(word).replace(0, 1, first).toString());
        }

        return capitalized.stream().collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        // Test: Capitalize is a function
        System.out.println("Capitalize is a function? " + (capitalize("") != null));

        // Test: capitalizes the first letter of every word in a sentence
        String test1 = "hi there, how is it going?";
        String expected1 = "Hi There, How Is It Going?";
        System.out.println("Input: " + test1);
        System.out.println("Expected: " + expected1);
        System.out.println("Got: " + capitalize(test1));
        System.out.println();

        // Test: capitalizes the first letter
        String test2 = "i love breakfast at bill miller bbq";
        String expected2 = "I Love Breakfast At Bill Miller Bbq";
        System.out.println("Input: " + test2);
        System.out.println("Expected: " + expected2);
        System.out.println("Got: " + capitalize(test2));
        System.out.println();

        // --- Examples
        String ex1 = "a short sentence";
        System.out.println("Input: " + ex1);
        System.out.println("Expected: A Short Sentence");
        System.out.println("Got: " + capitalize(ex1));
        System.out.println();

        String ex2 = "a lazy fox";
        System.out.println("Input: " + ex2);
        System.out.println("Expected: A Lazy Fox");
        System.out.println("Got: " + capitalize(ex2));
        System.out.println();

        String ex3 = "look, it is working!";
        System.out.println("Input: " + ex3);
        System.out.println("Expected: Look, It Is Working!");
        System.out.println("Got: " + capitalize(ex3));
    }

}
