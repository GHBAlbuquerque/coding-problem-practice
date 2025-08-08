package com.medium._13threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find two numbers that sum to (target - fixed number) --> this is two sum!
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // sort the array to use 2 pointers
        List<List<Integer>> triplets = new ArrayList<>();

        // fix the first number
        for(int fixed = 0; fixed <= nums.length-3; fixed++) {
            if(fixed > 0 && nums[fixed] == nums[fixed-1]) {
                continue; // skip fixed if is equal to the previous
            }

            int start = fixed+1;
            int end = nums.length - 1;

            //use two-pointers to try and find the triplets
            while(start < end) {
                int result = nums[fixed] + nums[start] + nums[end];

                if(result == 0) {
                    List<Integer> triplet = List.of(nums[fixed], nums[start], nums[end]);
                    triplets.add(triplet);
                }

                // move pointers
                // check if the next start/end are equal, if they are look for next
                if (result < 0) {
                    start++;
                    while(start < end && nums[start] == nums[start-1]) {
                        start++;
                    }
                } else {
                    end--;
                    while(start < end && nums[end] == nums[end+1]) {
                        end--;
                    }
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> result = ThreeSum.threeSum(nums);

        System.out.println(result);

        int[] nums1 = new int[] {0,0,0};
        List<List<Integer>> result1 = ThreeSum.threeSum(nums1);

        System.out.println(result1);
    }
}
