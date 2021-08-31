package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Remove all occurrences of the specified number from the array
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter the number ");
        Scanner console=new Scanner(System.in);
        int number=console.nextInt();

        int array[]=new int[5];
        for (int i=0; i< array.length; i++) {
            array[i] = (int) (Math.round(Math.random() * 10));
            System.out.println(Arrays.toString(array));
            if (array[i] == number) {
                array[i] = i + 1;
            }
        }
        System.out.println("------------------");
            System.out.println(Arrays.toString(array));
    }
}
