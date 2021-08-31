package array;

import java.util.Arrays;

/**
 * Implement a bubble sorting algorithm
 */

public class Task7 {
    public static void main(String[] args) {
        int [] array = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
