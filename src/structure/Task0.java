package structure;

import java.util.Scanner;

/**
 * Output the name of the time of the year by the number of the month
 */
    public class Task0 {
        public static void main(String[] args) {
            System.out.println("Enter the month number");

            Scanner console= new Scanner(System.in);
            String number=console.nextLine();

            switch (number){

                case "1":
                    System.out.println("January");
                    break;
                case "2" :
                    System.out.println("February");
                    break;
                case "3":
                    System.out.println("March");
                    break;
                case "4":
                    System.out.println("April");
                    break;
                case "5":
                    System.out.println("May");
                    break;
                case "6":
                    System.out.println("June");
                    break;
                case "7":
                    System.out.println("July");
                    break;
                case "8":
                    System.out.println("August");
                    break;
                case "9":
                    System.out.println("September");
                    break;
                case "10":
                    System.out.println("October");
                    break;
                case "11":
                    System.out.println("November");
                    break;
                case "12":
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Non-correct data was entered");
            }
        }
    }


