package multidimensionalArray;

import java.util.Arrays;

/**
 * Sort the elements in the rows of the two-dimensional array in ascending order.
 */

public class Task5 {
    public static void main(String[] args) {
        int [][] array={{2,5,4,3},{23,5,3,1},{4,5,2,3}};
        for (int[] innerArray : array) {
            Arrays.sort(innerArray);
        }
        System.out.println(Arrays.toString(array));
    }
}
