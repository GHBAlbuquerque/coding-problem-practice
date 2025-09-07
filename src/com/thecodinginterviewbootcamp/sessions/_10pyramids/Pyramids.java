package com.thecodinginterviewbootcamp.sessions._10pyramids;

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(3)
//       '  #  '
//       ' ### '
//       '#####'

public class Pyramids {

    public static void pyramid(int n) {
        recursion(n, 0);
    }

    private static void recursion(int n, int level){
        if(n == level) {
            return;
        }

        int total = (n-1)*2+1;
        int pyramid = level*2+1;
        int spaces = Math.max(0, total - pyramid);
        StringBuilder step = new StringBuilder();

        step.append(" ".repeat((spaces/2)));
        step.append("#".repeat(pyramid));
        step.append(" ".repeat(spaces/2));

        System.out.println(step);

        recursion(n, level+1);
    }

    public static void main(String[] args) {
        // Test 1: pyramid is a function
        System.out.println("pyramid is a method: " + (Pyramids.class != null));
        System.out.println();

        // Test 2: pyramid(2)
        System.out.println("Expected output for n=2:");
        System.out.println(" # ");
        System.out.println("###");
        System.out.println("Your output:");
        pyramid(2);
        System.out.println();

        // Test 3: pyramid(3)
        System.out.println("Expected output for n=3:");
        System.out.println("  #  ");
        System.out.println(" ### ");
        System.out.println("#####");
        System.out.println("Your output:");
        pyramid(3);
        System.out.println();

        // Test 4: pyramid(4)
        System.out.println("Expected output for n=4:");
        System.out.println("   #   "); // 0 -
        System.out.println("  ###  "); // 1 - +1 each side
        System.out.println(" ##### "); // 2 - +2 each side --- total: (n-1)*2+1  #:level*2+1
        System.out.println("#######"); // 3 - +3 each side --- total: (n-1)*2+1
        System.out.println("Your output:");
        pyramid(4);
        System.out.println();
    }
}
