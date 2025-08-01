package com.medium._02subArraysWithMaximumSums;

public class SubArraysWithMaximumSums {

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // maximum one found yet
        int currentSum = 0; // value of the current subarray

        for(int i=0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            System.out.println(currentSum);
            //If adding nums[i] makes it worse, just restart the subarray from nums[i]

            maxSum = Math.max(maxSum, currentSum);
            // then substitute the value if it is greater than the sum
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(SubArraysWithMaximumSums.maxSubArray(nums));
    }
}