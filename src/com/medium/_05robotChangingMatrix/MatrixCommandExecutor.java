package com.medium._05robotChangingMatrix;

import java.util.Arrays;

public class MatrixCommandExecutor {

    public static int[][] swapRows(int[][] mat, int row1, int row2) {
        int[] temp = mat[row1];
        mat[row1] = mat[row2];
        mat[row2] = temp;

        return mat;
    }

    public static int[][] swapColumns(int[][] mat, int col1, int col2) {

        for(int i=0; i<mat.length; i++) {
            int temp = mat[i][col1];
            mat[i][col1] = mat[i][col2];
            mat[i][col2] = temp;
        }

        return mat;
    }

    public static int[][] reverseRow(int[][] mat, int row) {
        int rowLength = mat[row].length;

        for(int i=0; i<rowLength/2; i++) {
            int temp = mat[row][i];
            mat[row][i] = mat[row][rowLength-1-i];
            mat[row][rowLength-1-i] = temp;
        }

        return mat;
    }

    public static int[][] reverseColumn(int[][] mat, int col) {
        int colLength = mat.length;

        for(int i=0; i<colLength/2; i++) {
            int temp = mat[i][col];
            mat[i][col] = mat[colLength-1-i][col];
            mat[colLength-1-i][col] = temp;
        }

        return mat;
    }

    public static int[][] flipMatrix180(int[][] mat) {
        int[][] swappedMatrix = new int[mat[0].length][mat.length];
        System.out.println("flipMatrix180");
        return mat;
    }


    public static int[][] solution(int[][] matrix, String[] commands) {

        for(String command : commands) {
            String[] splitString = command.split(" ");

            switch(splitString[0]) {
                case "swapRows": {
                    matrix = swapRows(matrix, Integer.valueOf(splitString[1]), Integer.valueOf(splitString[2]));
                    break;
                }
                case "swapColumns": {
                    matrix = swapColumns(matrix, Integer.valueOf(splitString[1]), Integer.valueOf(splitString[2]));
                    break;
                }
                case "reverseRow": {
                    matrix = reverseRow(matrix, Integer.valueOf(splitString[1]));
                    break;
                }
                case "reverseColumn": {
                    matrix = reverseColumn(matrix, Integer.valueOf(splitString[1]));
                    break;
                }
                case "flipMatrix180": {
                    matrix = flipMatrix180(matrix);
                    break;
                }
            }

        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}};

        Arrays.stream(matrix1).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));

        MatrixCommandExecutor.solution(matrix1, new String[] {
                "swapRows 0 2",
                "swapColumns 0 2",
                "reverseRow 1",
                "reverseColumn 1",
                "flipMatrix180"
        });

        Arrays.stream(matrix1).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));
    }

}
