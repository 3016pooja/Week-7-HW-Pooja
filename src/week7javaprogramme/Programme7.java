package week7javaprogramme;

import java.util.Scanner;

/*
7.	Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/
public class Programme7 {
    static int salesID,salesAmount,basicSalary;
    static double Commission;
    static String sellersname;

    public static void main(String[] args) {
        input();

    }
    public static void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sales ID:");
        salesID=scanner.nextInt();
        System.out.println("Enter a seller's name:");
        sellersname=scanner.next();
        System.out.println("Enter a sales amount:");
        salesAmount=scanner.nextInt();
        System.out.println("Enter Basic salary:");
        basicSalary=scanner.nextInt();
        if(salesAmount>=50000){
            Commission=(salesAmount*35)/100;
            System.out.println("saler's commision is:" + Commission);
        } else if (salesAmount>= 30000) {
            Commission=(salesAmount*20)/100;
            System.out.println("saler's commision is :"+ Commission);
        }else if (salesAmount>= 20000) {
            Commission=(salesAmount*10)/100;
            System.out.println("saler's commision is :"+ Commission);
        }else if (salesAmount>= 10000) {
            Commission=(salesAmount*5)/100;
            System.out.println("saler's commision is :"+ Commission);
        }else  {
            Commission=(salesAmount*2)/100;
            System.out.println("saler's commision is :"+ Commission);
        }

    }
}
