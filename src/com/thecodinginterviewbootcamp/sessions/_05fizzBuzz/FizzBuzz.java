package com.thecodinginterviewbootcamp.sessions._05fizzBuzz;

// --- Directions
// Write a program that console logs the numbers
// from 1 to n.
// But for multiples of three print
// “fizz” instead of the number and for the multiples
// of five print “buzz”.
// For numbers which are multiples
// of both three and five print “fizzbuzz”.
// --- Example
//   fizzBuzz(5);
//   1
//   2
//   fizz
//   4
//   buzz


public class FizzBuzz {

    public static void fizzBuzz(int n) {
        for(int i=0; i<=n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // "test" that method exists
        System.out.println("Test: FizzBuzz method is defined -> "
                + (FizzBuzz.class != null));

        // test: Calling fizzBuzz(5) prints out 5 statements
        System.out.println("\nTest: fizzBuzz(5) should print 5 lines");
        fizzBuzz(5);

        // test: Calling fizzBuzz(15) prints out the correct values
        System.out.println("\nTest: fizzBuzz(15) should print:");
        System.out.println("1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizzbuzz");
        System.out.println("\nYour output:");
        fizzBuzz(15);
    }
}
