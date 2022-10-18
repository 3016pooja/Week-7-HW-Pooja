package week7javaprogramme;
/* 1. Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)

 */
//number%2==0 -> Even number

import java.util.Scanner;

public class Programme1 {
    int num;
    String b;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to see whether its odd or even:");
        int num = scanner. nextInt();
        String b=(num % 2==0)?"even":"odd";
        System.out.println(b);
        Programme1 programme1=new Programme1();
        programme1.number();

    }
    //instance method
    public void number(){

       // System.out.println("The entered number "+ "num" +" is Even");
        System.out.println(b);


    }

}
