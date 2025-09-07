package com.thecodinginterviewbootcamp.sessions._09steps;


// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'

import java.util.ArrayList;
import java.util.List;

public class Steps {

    public static List<String> steps(int n) {
        List<String> steps = new ArrayList<>();

        for(int i=1;i<=n;i++) {
            StringBuilder step = new StringBuilder();
            int voids = n-i;

            step.append("#".repeat(i));
            step.append(" ".repeat(voids));

            steps.add(step.toString());
        }

        return steps;
    }

    public static void main(String[] args) {
        // --- Test 1: steps(1)
        System.out.println("steps(1):");
        for (String line : steps(1)) {
            System.out.println(line);
        }
        System.out.println();

        // --- Test 2: steps(2)
        System.out.println("steps(2):");
        for (String line : steps(2)) {
            System.out.println(line);
        }
        System.out.println();

        // --- Test 3: steps(3)
        System.out.println("steps(3):");
        for (String line : steps(3)) {
            System.out.println(line);
        }
        System.out.println();
    }
}
