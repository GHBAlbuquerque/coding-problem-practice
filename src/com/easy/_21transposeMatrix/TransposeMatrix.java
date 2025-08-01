package com.easy._21transposeMatrix;/*
Input:
matrix = [[1,2,3],
          [4,5,6],
          [7,8,9]]

Output: [[1,4,7],
         [2,5,8],
         [3,6,9]]

[i],[j]    [i],[j+1],   [i],[j+2]
[i+1],[j], [i+1],[j+1], [i+1],[j+2]
[i+2],[j], [i+2],[j+1], [i+2],[j+2]
 */

import java.util.*;

public class TransposeMatrix {

    public static void print(int[][] matrix) {
        System.out.println("Matrix::");
        for(int[] array : matrix) {
            System.out.printf("%s\n", Arrays.toString(array));
        }
    }

    public static int[][] transpose(int[][] matrix) {

        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        //invert dimensions because it is transposed

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++) {
                //System.out.printf("i is %s and j is %s\n", i, j);
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }

    public static void main(String[] args) {

        int[][] matrix1 = new int[][] {new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}};
        TransposeMatrix.print(matrix1);

        int[][] result1 = TransposeMatrix.transpose(matrix1);
        TransposeMatrix.print(result1);

        //square
        int[][] matrix2 = new int[][] {
                new int[]{1, 2},
                new int[]{3, 4}
        };
        TransposeMatrix.print(matrix2);
        int[][] result2 = TransposeMatrix.transpose(matrix2);
        TransposeMatrix.print(result2);


        // more columns than rows
        int[][] matrix3 = new int[][] {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6}
        };
        TransposeMatrix.print(matrix3);
        int[][] result3 = TransposeMatrix.transpose(matrix3);
        TransposeMatrix.print(result3);

        // more rows than colums
        int[][] matrix4 = new int[][] {
                new int[]{1, 2},
                new int[]{3, 4},
                new int[]{5, 6}
        };
        TransposeMatrix.print(matrix4);
        int[][] result4 = TransposeMatrix.transpose(matrix4);
        TransposeMatrix.print(result4);
    }
}