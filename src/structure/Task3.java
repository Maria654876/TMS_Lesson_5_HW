package structure;

import java.util.Scanner;

/**
 * Output the temperature
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");

        Scanner console=new Scanner(System.in);
        int t=console.nextInt();

        if (t>-5){
            System.out.println("Тепло");
        } else if(t<=-5 && t>-20){
            System.out.println("Нормально");
        } else if(t<=-20){
            System.out.println("Холодно");
        }
    }
}
