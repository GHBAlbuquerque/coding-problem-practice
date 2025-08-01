package com.specifics.capitalOne._03findMissingNumber;

public class FindMissingNumber {

    public static int missingNumber(int[] nums) {
        // compare the expected sum of the number between 0 to n
        int length = nums.length;
        int expectedTotal = (length * (length+1))/2;

        // with the real sum of numbers from 0 to n
        int total = 0;
        for(int i=0; i<length; i++) {
            total+=nums[i];
        }

        return expectedTotal - total;
    }

    public static void main(String[] args) {
        int[] array = new int[] {9,6,4,2,3,5,7,0,1};
        System.out.println(FindMissingNumber.missingNumber(array));
    }
}