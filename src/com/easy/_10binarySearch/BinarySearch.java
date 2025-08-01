package com.easy._10binarySearch;

public class BinarySearch {

    public static void testSearch(int[] nums, int target){
        int result = BinarySearch.search(nums, target);
        System.out.printf("Found number %s in position %s\n", target, result);
    }

    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;

        int lowest = 0;
        int highest = nums.length-1;

        while(lowest <= highest){
            int index = lowest + (highest - lowest)/2; // should always get the mid point between the lowest point and the end
            int evaluated = nums[index];

            System.out.printf("This is the number at position %s: %s\n", index, evaluated);
            if(lowest == highest  && evaluated != target) return -1;
            if(evaluated == target) return index;

            if(evaluated < target) {
                lowest = index+1; //already check the index value, so should be the one after
            } else {
                highest = index-1; //already check the index value, so should be the one before
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        testSearch(new int[] {-1, 0, 3, 5, 9, 12}, 9);    // 4
        testSearch(new int[] {-1, 0, 3, 5, 9, 12}, 2);    // -1
        testSearch(new int[] {1, 2, 3, 4, 5}, 1);          // 0
        testSearch(new int[] {1, 2, 3, 4, 5}, 5);          // 4
        testSearch(new int[] {1}, 1);                       // 0
        testSearch(new int[] {1}, 0);                       // -1
        testSearch(new int[] {}, 3);                        // -1
        testSearch(new int[] {2, 4, 6, 8, 10}, 6);         // 2
        testSearch(new int[] {2, 4, 6, 8, 10}, 7);         // -1
        testSearch(new int[] {10, 20, 30, 40, 50}, 50);    // 4

    }
}