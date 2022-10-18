package week7javaprogramme;
/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”

 */

import java.util.Scanner;

public class Programme16 {
    int number;
    public static void main(String[] args) {
        postive();
    }
    public static void postive(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int number;
        number= scanner.nextInt();
        scanner.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        } else {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
