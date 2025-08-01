package com.medium._07rotateMatrix;

import java.util.Arrays;

public class RotateMatrix {

    public static void print(int[][] matrix) {
        System.out.println("Matrix::");
        for (int[] array : matrix) {
            System.out.printf("%s\n", Arrays.toString(array));
        }
    }

    public static void rotate(int[][] matrix) {
        // transpose
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j]; //since they are the same size, it can be done in-place
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse
        for(int i=0; i<matrix.length;i++) {
            for(int j=0;j< matrix.length / 2;j++) { // just want to swap until the middle
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = new int[][] {new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};
        RotateMatrix.print(mat);

        RotateMatrix.rotate(mat);
        RotateMatrix.print(mat);

        int[][] mat2 = new int[][] {new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12},  new int[]{13, 14, 15, 16}};
        RotateMatrix.print(mat2);

        RotateMatrix.rotate(mat2);
        RotateMatrix.print(mat2);
    }
}
