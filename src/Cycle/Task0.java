package Cycle;

/**
 * Display odd numbers from 1 to 99 on the screen
 */

public class Task0 {
    public static void main(String[] args) {

        for (int x=1; x<100; x++){
           if (x%2==0){
               continue;
           }
            System.out.println(x);
        }
    }
}
