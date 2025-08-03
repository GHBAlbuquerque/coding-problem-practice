package com.medium._05robotChangingMatrix;

import java.util.Arrays;

public class MatrixCommandExecutor {

    private static int[][] swapRows(int[][] mat, int row1, int row2) {
        int[] temp = mat[row1];
        mat[row1] = mat[row2];
        mat[row2] = temp;

        return mat;
    }

    private static int[][] swapColumns(int[][] mat, int col1, int col2) {

        for(int i=0; i<mat.length; i++) {
            int temp = mat[i][col1];
            mat[i][col1] = mat[i][col2];
            mat[i][col2] = temp;
        }

        return mat;
    }

    private static int[][] reverseRow(int[][] mat, int row) {
        int rowLength = mat[row].length;

        for(int i=0; i<rowLength/2; i++) {
            int temp = mat[row][i];
            mat[row][i] = mat[row][rowLength-1-i];
            mat[row][rowLength-1-i] = temp;
        }

        return mat;
    }

    private static int[][] reverseColumn(int[][] mat, int col) {
        int colLength = mat.length;

        for(int i=0; i<colLength/2; i++) {
            int temp = mat[i][col];
            mat[i][col] = mat[colLength-1-i][col];
            mat[colLength-1-i][col] = temp;
        }

        return mat;
    }

    private static int[][] transposeMatrix(int[][] mat) {
        int[][] transposedMatrix = new int[mat[0].length][mat.length]; // don't know if they are square matrixes

        for(int i=0; i< mat.length;i++){
            for(int j=0; j< mat[i].length;j++){
                transposedMatrix[j][i] = mat[i][j];
            }
        }
        return transposedMatrix;
    }


    private static int[][] flipMatrix90(int[][] mat) {
        int[][] newMatrix = transposeMatrix(mat);
        int length = newMatrix.length;

        for(int i=0; i<length; i++){
            newMatrix = reverseRow(newMatrix, i);
        }

        return newMatrix;
    }



    public static int[][] solution(int[][] matrix, String[] commands) {

        for(String command : commands) {
            String[] splitString = command.split(" ");

            switch(splitString[0]) {
                case "swapRows": {
                    matrix = swapRows(matrix, Integer.valueOf(splitString[1]), Integer.valueOf(splitString[2]));
                    /*System.out.println("Swapped rows!");
                    Arrays.stream(matrix).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));*/
                    break;
                }
                case "swapColumns": {
                    matrix = swapColumns(matrix, Integer.valueOf(splitString[1]), Integer.valueOf(splitString[2]));
                    /*System.out.println("Swapped cols!");
                    Arrays.stream(matrix).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));*/
                    break;
                }
                case "reverseRow": {
                    matrix = reverseRow(matrix, Integer.valueOf(splitString[1]));
                    /*System.out.println("Reversed rows!");
                    Arrays.stream(matrix).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));*/
                    break;
                }
                case "reverseColumn": {
                    matrix = reverseColumn(matrix, Integer.valueOf(splitString[1]));
                    /*System.out.println("Reversed cols!");
                    Arrays.stream(matrix).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));*/
                    break;
                }
                case "flipMatrix180": {
                    matrix = flipMatrix90(matrix);
                    /*System.out.println("Flipped 90!");
                    Arrays.stream(matrix).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));*/

                    matrix = flipMatrix90(matrix);
                    /*System.out.println("Flipped 90!");
                    Arrays.stream(matrix).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));*/
                    break;
                }
            }

        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}};

        Arrays.stream(matrix1).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));

        int[][] result = MatrixCommandExecutor.solution(matrix1, new String[] {
                "swapRows 0 2",
                "swapColumns 0 2",
                "reverseRow 1",
                "flipMatrix180"
        });

        Arrays.stream(result).toList().stream().forEach(row -> System.out.println(Arrays.toString(row)));
    }

}
