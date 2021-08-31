package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Displays a message about whether the specified number is included in the array or not
 */

public class Task0 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");

        Scanner console= new Scanner(System.in);
        int number=console.nextInt();
        System.out.println(find(8));
    }
    private static int find(int number){
        int [] array=new int[5];
        for (int i=0; i< array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            Arrays.sort(array);
            if (array[i] == number) {
                System.out.println("find");
                return i;
            } else {
                System.out.println("Not find");
            }
        }
        return -1;
    }
}
