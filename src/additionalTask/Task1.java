package additionalTask;

import java.util.Scanner;

/**
 * The user enters the deposit amount and the number of months.
 * And the bank calculates the final amount of the deposit, taking into account the accrual of interest for each month.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter the deposit amount ");
        Scanner console=new Scanner(System.in);
        float sum=console.nextFloat();

        System.out.print("Enter the number of months ");
        Scanner number=new Scanner(System.in);
        int numberMonths=number.nextInt();

        float x;
        float y=0;

        for (int i=1; i<=numberMonths; i++){
           x=(sum/100)*7;
           y+=x;
        }
        System.out.println(y);
    }
}
