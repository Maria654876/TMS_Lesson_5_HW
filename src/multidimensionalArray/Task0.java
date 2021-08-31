package multidimensionalArray;

import java.util.Scanner;

/**
 * Create a three-dimensional array of integers Using loops to "pass" through the entire array and increase each element by a given number.
 * Let the number by which each element will increase be set from the console.
 */

public class Task0 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner console=new Scanner(System.in);
        int arr= console.nextInt();

        int [][][] array={{{1,2,3,4},{5,6,7,8},{2,4,5,6}}};

        for (int [][]array1:array){
            for(int [] array2:array1){
                for(int array3:array2){
                   array3++;
                    System.out.print(array3+" ");
                    System.out.println();
                }
                System.out.println();
            }
        }

    }
}
