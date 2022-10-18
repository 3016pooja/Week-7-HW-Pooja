package week7javaprogramme;
/* 6.	Write a java program to input any number and find out if it’s odd or even

 */

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        input();

    }
    public static void input(){
        Scanner scanner=new Scanner(System.in);
        int num;
        String output;
        System.out.println("Enter a number:");
        num=scanner.nextInt();
        if(num%2==0) {
            System.out.println("Entered number is Even");
        }else {
            System.out.println("Entered number is odd");
        }



    }
    }

