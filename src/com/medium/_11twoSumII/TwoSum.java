package com.medium._11twoSumII;


import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                return new int[] {start+1, end+1};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {2,7,11,15};
        int[] result = TwoSum.twoSum(numbers, 9);

        System.out.println(Arrays.toString(result));
    }
}
