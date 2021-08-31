package Cycle;

import java.util.Scanner;

/**
 * The user enters any positive integer. And the program sums up all the numbers from 1 to the number entered by the user.
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");

        Scanner console=new Scanner(System.in);
        int number=console.nextInt();

        int s=0;

       for(int i=1; i<=number; i++){
           s=s+i;
       }
        System.out.println("Sum="+s);
    }
}
