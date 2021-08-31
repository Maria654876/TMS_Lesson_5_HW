package array;

import java.util.Arrays;

/**
 * Output the array to the screen as a string.
 *  Replace each element with an odd index with zero.
 *  Again, you will display the array on a separate line.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] array=new int[10];
        int element=0;
        for(int i=0; i< array.length; i++){
            array[i]=(int)(Math.round(Math.random()*100));
            if (array[i]%2==0){
                element++;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] array2=new int[element];
        int index=0;
        for(int i=0; i<element; i++){
            if (array2[i]%2==0){
               array2[index]=array2[i];
               index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
