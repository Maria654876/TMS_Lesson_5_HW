package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Calculate the arithmetic mean of the elements of each array and tell us for which of the arrays this value was greater (or tell us that their arithmetic averages are equal)
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int[] array1=new int[5];
        int[] array2=new int[5];
        System.out.println("Enter the element array1 ");
         for(int i=0; i< array1.length; i++){
             array1[i]=console.nextInt();
         }
        System.out.print("Enter the element array2 ");
        for(int i=0; i< array2.length; i++){
            array2[i]=console.nextInt();
        }
        System.out.println("Array 1 -"+ Arrays.toString(array1));
        System.out.println("Array 2 -"+ Arrays.toString(array2));

        var sum1=Arrays.stream(array1).sum();
        var sum2=Arrays.stream(array2).sum();

        double sr1=sum1/ array1.length;
        double sr2=sum2/ array2.length;

        System.out.println("Arithmetic mean of array1 - "+sr1);
        System.out.println("Arithmetic mean of array2 - "+sr2);

        if (sr1>sr2){
            System.out.println("The Array1 is larger");
        }else if(sr2>sr1){
            System.out.println("The Array2 is larger");
        }else {
            System.out.println("The arrays are equal");
        }
    }
}
