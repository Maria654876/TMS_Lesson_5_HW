package multidimensionalArray;

/**
 * Multiplication of two matrices
 */

public class Task2 {
    public static void main(String[] args) {
        int [][] Array1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] Array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int[][]Array3 = new int [Array1.length][Array2[0].length];
        for (int i=0; i<Array3[0].length; i++)
            for (int j=0; j<Array3.length; j++)
                for (int k=0; k<Array1[0].length; k++)
                    Array3[i][j] = Array3[i][j] + Array1[i][k] * Array2[k][j];

        for (int i = 0; i < Array3.length; i++) {
            for (int j = 0; j < Array3[0].length; j++) {
                System.out.print(" " + Array3[i][j] + " ");
            }
            System.out.println();
        }
}
}
