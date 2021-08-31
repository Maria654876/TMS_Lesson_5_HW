package array;

import java.util.Arrays;

/**
 * Create an array of strings. Fill it with arbitrary names of people.
 *  Sort the array.
 *  Output the result to the console.
 */

public class Task6 {
    public static void main(String[] args) {
        String[] array=new String[5];
        array[0]="Irina";
        array[1]="Elena";
        array[2]="Ivan";
        array[3]="Alina";
        array[4]="Misha";
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
