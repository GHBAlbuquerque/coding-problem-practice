import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            int result = target - nums[i];
            if(seen.get(result) != null) {
                return new int[] {seen.get(result), i};
            }
            seen.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void testTwoSum(int[] nums, int target) {
        System.out.println("Input: " + Arrays.toString(nums) + ", Target: " + target);
        int[] result = twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
        System.out.println();
    }

    public static void main(String[] args) {
        testTwoSum(new int[] {1, 1}, 2);
        testTwoSum(new int[] {-3, 4, 3, 90}, 0);
        testTwoSum(new int[] {0, 4, 3, 0}, 0);
        testTwoSum(new int[] {2, 5, 5, 11}, 10);
        testTwoSum(new int[] {3, 3}, 6);
        testTwoSum(new int[] {1, 2, 3, 4, 5}, 6);
        testTwoSum(new int[] {-1000000000, 1000000000}, 0);
    }
}