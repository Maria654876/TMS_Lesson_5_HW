package structure;

import java.util.Scanner;

/**
 * Whether to display the message an even number or not
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");

        Scanner console=new Scanner(System.in);
        int number=console.nextInt();

        if (number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Not even");
        }
    }
}
