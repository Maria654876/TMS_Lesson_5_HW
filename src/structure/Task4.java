package structure;

import java.util.Scanner;

/**
 * Use the entered number to determine the color of the rainbow
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the color number");

        Scanner console= new Scanner(System.in);
        String number=console.nextLine();

        switch (number){
            case "1":
                System.out.println("Red");
                break;
            case "2":
                System.out.println("Orange");
                break;
            case "3":
                System.out.println("Yellow");
                break;
            case "4":
                System.out.println("Green");
                break;
            case "5":
                System.out.println("Cyan");
                break;
            case "6":
                System.out.println("Blue");
                break;
            case "7":
                System.out.println("Violet");
                break;
            default:
                System.out.println("Non-correct data was entered");
        }
    }
}
