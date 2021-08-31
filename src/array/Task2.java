package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create and fill the array with random numbers and output the maximum, minimum and average values
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter the size of array ");
        Scanner console=new Scanner(System.in);
        int size= console.nextInt();

        int[] array=new int[size];
        for (int i=0; i< array.length; i++){
            array[i]=(int)(Math.round(Math.random()*100));
        }
        System.out.println(Arrays.toString(array));

        var min= Arrays.stream(array).min();
        var max=Arrays.stream(array).max();
        var sum=Arrays.stream(array).sum();
        System.out.println("Minimal - "+min);
        System.out.println("Max - "+max);
        System.out.println("Sum - "+sum);

    }
}
