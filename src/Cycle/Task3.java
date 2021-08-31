package Cycle;

/**
 * Display the following sequence on the screen:
 *  7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 */

public class Task3 {
    public static void main(String[] args) {

        int x=1;

        while (x<=98){
            for(;x<=14; x++){
                System.out.println(7*x);
            }
        }
    }
}
