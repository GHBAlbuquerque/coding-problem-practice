package com.medium._12containerWithMostWater;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int biggestArea = 0;

        while(start < end) {
            int hStart = height[start];
            int hEnd = height[end];
            int area = Math.min(hStart, hEnd) * (end - start);

            if(area >= biggestArea) {
                biggestArea = area;
            }

            if(hStart < hEnd) {
                start++;
            } else {
                end--;
            }
        }

        return biggestArea;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int result = ContainerWithMostWater.maxArea(height);

        System.out.println(result);
    }
}
