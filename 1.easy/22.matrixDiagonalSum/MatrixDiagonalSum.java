public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int l = mat.length;

        for(int i=0;i<l;i++) {
            int j = l-1-i;

            System.out.printf("i is %s and j is %s\n", i, j);

            sum = sum + mat[i][i] + mat[i][j];
        }

        if(mat.length % 2 == 1) { //when the matrix is odd, remove duplicate middle element
            sum = sum - mat[l/2][l/2];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}};
        System.out.println(MatrixDiagonalSum.diagonalSum(matrix1));
    }
}