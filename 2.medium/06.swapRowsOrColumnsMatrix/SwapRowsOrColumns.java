/*
1.	swapRows(mat, row1, row2) — swaps row row1 with row row2
2.	swapColumns(mat, col1, col2) — swaps column col1 with column col2
 */
import java.util.*;

class SwapOperation {
    String type; // "row" or "column"
    int index1;
    int index2;

    public SwapOperation(String type, int index1, int index2) {
        this.type = type;
        this.index1 = index1;
        this.index2 = index2;
    }

}

public class SwapRowsOrColumns {

    final static String ROW = "row";
    final static String COLUMN = "column";

    public static void print(int[][] matrix) {
        System.out.println("Matrix::");
        for(int[] array : matrix) {
            System.out.printf("%s\n", Arrays.toString(array));
        }
    }

    private static int[][] swapColumns(int[][] mat, int col1, int col2) {
        for(int i=0; i<mat.length; i++){
            int temp = mat[i][col1];
            mat[i][col1] = mat[i][col2];
            mat[i][col2] = temp;
        }

        return mat;
    }

    private static int[][] swapRows(int[][] mat, int row1, int row2) {
        int[] temp = mat[row1];

        mat[row1] = mat[row2];
        mat[row2] = temp;

        return mat;
    }

    public static int[][] applySwaps(int[][] mat, List<SwapOperation> ops) {

        for(SwapOperation op : ops) {
            if(ROW.equals(op.type)) {
                SwapRowsOrColumns.swapRows(mat, op.index1, op.index2);
            } else if (COLUMN.equals(op.type)) {
                SwapRowsOrColumns.swapColumns(mat, op.index1, op.index2);
            }
        }

        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][] {new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};
        SwapRowsOrColumns.applySwaps(mat, List.of(new SwapOperation(ROW, 0, 2), new SwapOperation(COLUMN, 1, 2)));

        SwapRowsOrColumns.print(mat);
    }
}