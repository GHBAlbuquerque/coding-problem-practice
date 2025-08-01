package com.specifics.capitalOne._08ImplementBinarySearch;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int lowest = 0;
        int highest = nums.length - 1;

        while(highest >= lowest) {
            int index = lowest + (highest - lowest)/2;

            if(target == nums[index]) {
                return index;
            } else if (target > nums[index]) {
                lowest = index + 1;
            } else {
                highest = index - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;

        System.out.printf("index is %s\n", com.easy._10binarySearch.BinarySearch.search(nums, target));

    }
}