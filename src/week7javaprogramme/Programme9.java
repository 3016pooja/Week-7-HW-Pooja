package week7javaprogramme;
/*Input any alphabet from “A" to “F” and print their city name accordingly
(use if else) if  any other alphabet should be invalid entry . using switch
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        cityName();

    }
    public static void cityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter between A to F:");
        char city = scanner.next().charAt(0);
        switch (city) {
            case 'a':
                System.out.println("Amritsar");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("East london");
                break;
            case 'f':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
