package com.easy._25smallestMissingPositiveInt;

import java.util.HashSet;
import java.util.Set;

public class SmallestMissingPositiveInt {
    class Solution {
        public int solution(int[] A) {
            Set<Integer> seen = new HashSet<>();
            int smallest = 1;

            for(int number : A) {
                if(!seen.contains(number)) {
                    seen.add(number);
                }

                while(seen.contains(smallest)) {
                    ++smallest;
                }
            }

            return smallest;
        }
    }
}
