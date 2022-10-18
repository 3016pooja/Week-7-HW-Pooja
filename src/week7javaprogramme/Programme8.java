package week7javaprogramme;

import java.util.Scanner;

/*8.	Input any alphabet from “A" to “F” and print their city name accordingly
 (use if else) if any other alphabet should be invalid entry
 */
public class Programme8 {
    static char city;
    public static void main(String[] args) {
        alphabet();

    }
    public static void alphabet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter from A to F:");
        city = scanner.next().charAt(0);
        if (city == 'a' || city == 'A') {
            System.out.println("Ahemdabad");
        } else if(city == 'b' || city == 'B'){
            System.out.println("Bombay");
        } else if (city == 'c' || city == 'C') {
            System.out.println("Chennai");
        } else if (city == 'd' || city == 'D') {
                System.out.println("Dehradun");
            }  else if (city == 'e' || city == 'E') {
                System.out.println("East london");
        } else if (city=='f'||city=='F') {
            System.out.println("France");
        }else {
            System.out.println("Invalid ");
        }
    } 
}
