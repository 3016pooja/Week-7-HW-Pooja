package week7javaprogramme;
/*Write a java program to input any two number and ask user to enter their symbol
(+, -,  /, *) find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

import java.util.Scanner;

public class Programme10 {
    static int c;
    public static void main(String[] args) {
        symbol();

    }
    public static void symbol(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any 2 Numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("Enter any symbol from +,-,/,*:");
        char sign=scanner.next().charAt(0);

        if(sign=='+') {
            c = a + b;
            System.out.println(+a + "+" + b + "=" + c);
        } else if (sign=='-') {
            c=a-b;
            System.out.println(+a + "-" + b + "=" + c);


    } else if (sign=='*') {
            c= a*b;
            System.out.println(+a+"*"+b+"="+ c);

        }else {
            c=(a/b);
            System.out.println(+a+"/"+b+"="+ c);
        }

    }
}
