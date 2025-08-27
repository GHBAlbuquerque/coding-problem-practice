package com.thecodinginterviewbootcamp.sessions._03reverseInteger;

// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9


// The gotchas!
// 1) Numbers can be turned into String using toString() or String.valueof()
// 2) You can check if a number is negative or positive by using Math.signum. Returns 1.0 if >0, 0 if 0 and -1 if <0 (but double and float)

public class ReverseInteger {

    public static int reverseInteger(int n) {
        int absN = Math.abs(n);
        StringBuilder reversed = new StringBuilder(String.valueOf(absN)).reverse();

        return (int) (Integer.parseInt(reversed.toString()) * Math.signum(n));
    }

    public static int reverseIntegerSol2(int n) {
        int abs = Math.abs(n);
        StringBuilder reversed = new StringBuilder(String.valueOf(n)).reverse();

        if(reversed.indexOf("-") != -1) {
            reversed.deleteCharAt(reversed.length()-1);
            reversed.insert(0, "-");
        }

        return Integer.parseInt(reversed.toString());
    }

    public static int reverseIntegerSol1(int n) {
        String value = String.valueOf(n);

        if(value.length() == 1) return n;

        StringBuilder reversed = new StringBuilder();
        for(Character algarism : value.toCharArray()) {
            if(algarism == '-') {
                continue;
            }

            reversed.insert(0, algarism);
        }

        /*
        Another option could be:
        if(Math.signum(n) == -1.0) reversed.insert(0, '-');
        */
        return (int) (Integer.parseInt(reversed.toString()) * Math.signum(n));
    }


    public static void main(String[] args) {
        // Test 1: function exists
        System.out.println("Test 1: reverseInteger function exists → " + (reverseInteger(0) == 0 || reverseInteger(0) != 0));

        // Test 2: handles 0 as input
        System.out.println("Test 2: reverseInteger(0) → " + reverseInteger(0));

        // Test 3: flips a positive number
        System.out.println("Test 3a: reverseInteger(500) → " + reverseInteger(500));
        System.out.println("Test 3b: reverseInteger(15) → " + reverseInteger(15));
        System.out.println("Test 3c: reverseInteger(90) → " + reverseInteger(90));
        System.out.println("Test 3d: reverseInteger(2359) → " + reverseInteger(2359));

        // Test 4: flips a negative number
        System.out.println("Test 4a: reverseInteger(-5) → " + reverseInteger(-5));
        System.out.println("Test 4b: reverseInteger(-15) → " + reverseInteger(-15));
        System.out.println("Test 4c: reverseInteger(-90) → " + reverseInteger(-90));
        System.out.println("Test 4d: reverseInteger(-2359) → " + reverseInteger(-2359));
    }
}
