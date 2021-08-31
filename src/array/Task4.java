package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create an array of n random integers and display it on the screen.
 *  Let the array size be set from the console and the array size can be greater than 5 and less than or equal to 10.
 *  If n does not satisfy the condition, print a message about it.
 *  Create a second array from only the even elements of the first array, if there are any, and display it on the screen.
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.print ("Enter the size of array ");
        Scanner console =new Scanner(System.in);
        int size= console.nextInt();
        if (size<5 || size>11){
            System.out.println("Error! Enter the size of array!");
            int size1=console.nextInt();
        } else if (size<=10 ){
            System.out.println("Entered the size of array");
        }
        int[] array=new int[size];
        int elevent=0;
        for (int i=0; i< array.length; i++){
            array[i]=(int)(Math.round(Math.random()*100));
            if (array[i]%2==0){
                elevent++;
            }
        }

        System.out.println(Arrays.toString(array));

        int [] array2=new int[elevent];
        int index = 0;
        for (int i = 0; i <elevent; i++) {
            if(array2[i]%2 == 0){
                array2[index] = array2[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
