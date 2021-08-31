package multidimensionalArray;

/**
 * Output the diagonals of the array to the console.
 */

public class Task4 {
    public static void main(String[] args){
        int[][] a = createMatrix(7);
        printMatrix(a);
    }
    public static int[][] createMatrix(int size) {
        int[][] a = new int [size][size];
        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
                a[i][j] = (i==j) || (i+j == size-1)? 1:0;
        return a;
    }
    public static void printMatrix(int[][] a) {
        for(int[] l : a) {
            for(int i : l)
                System.out.print("\t"+i);
            System.out.println();
        }
    }
}
