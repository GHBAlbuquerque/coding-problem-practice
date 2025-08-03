package com.medium._05robotChangingMatrix;

public class MatrixCommandExecutor {

    public static int[][] swapRows(int[][] mat, int row1, int row2) {
        int[][] swappedMatrix = new int[mat[0].length][mat.length];
        System.out.println("swapRows");
        return mat;
    }

    public static int[][] swapColumns(int[][] mat, int col1, int col2) {
        System.out.println("swapColumns");
        return mat;
    }

    public static int[][] reverseRow(int[][] mat, int row) {
        int[][] swappedMatrix = new int[mat[0].length][mat.length];
        System.out.println("reverseRow");
        return mat;
    }

    public static int[][] reverseColumn(int[][] mat, int col) {
        System.out.println("reverseColumn");
        return mat;
    }

    public static int[][] flipMatrix180(int[][] mat) {
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
        MatrixCommandExecutor.solution(matrix1, new String[] {
                "swapRows 0 2",
                "swapColumns 0 2",
                "reverseRow 1",
                "flipMatrix180"
        });
    }

}
