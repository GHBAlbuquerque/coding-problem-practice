package com.easy._05containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> seen = new HashSet();

        for(int num : nums) {
            if(seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums3 = {1, 2, 3, 4};

        System.out.print(ContainsDuplicate.containsDuplicate(nums)+ "\n");
        System.out.print(ContainsDuplicate.containsDuplicate(nums2) + "\n");
        System.out.print(ContainsDuplicate.containsDuplicate(nums3) + "\n");
    }
}