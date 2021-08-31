package structure;

import java.util.Scanner;

/**
 * Output of the name of the time of the year by the number of the month
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the month number ");

        Scanner console=new Scanner(System.in);
        int number= console.nextInt();

        if (number<=2){
            System.out.println("Winter");
        } else if(number>=3 && number<=5){
            System.out.println("Spring");
        } else if(number>=6 && number<=8){
            System.out.println("Summer");
        } else if(number>=9 && number<=11){
            System.out.println("Autumn");
        } else if (number==12){
            System.out.println("Winter");
        } else {
            System.out.println("Non-correct data was entered");
        }
    }
}
