package week7javaprogramme;
/* 5.	WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
    HRA = basic salary 10%
    DA = Basic salary 8%
    TA = Basic salary 9%
    PF= Basic salary 20%
    Gross salary = basic salary + HRA + TA + DA –PF

 */
import java.util.Scanner;

public class Programme5 {
    static int employeeID,basicsalary;
    static String name;
    static float hra,da,ta,pf,grosssalary;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        input();

    }
    public static void input(){

        System.out.println("Enter employee name:");
        name=sc.nextLine();
        System.out.println("Enter employee id:");
        employeeID=sc.nextInt();
        System.out.println("Enter employee's basic salary:");
        basicsalary= sc.nextInt();
        hra=(basicsalary*10)/100f;
        da=(basicsalary*8)/100f;
        ta=(basicsalary*9)/100f;
        pf=(basicsalary*20)/100f;

        grosssalary=(basicsalary+hra+ta+da)-pf;

        System.out.println("|-------------------------------|");
        System.out.println("|        Salary slip             |");
        System.out.println("|------------------------------- |");
        System.out.println("|Employee id     :"+employeeID+ "|");
        System.out.println("|Employee name    :"+name+       "|");
        System.out.println("|-------------------------------- |");
        System.out.println("|Basic salary     :"+basicsalary+"|");
        System.out.println("|HRA 10%         :" + hra+       "|");
        System.out.println("|TA 8%            :"+ ta +        "|");
        System.out.println("|DA 20%           :"+ da+         "|");
        System.out.println("|PF -20           :"+pf +          "|");
        System.out.println("|----------------------------------|");
        System.out.println("|Gross Salary    :"+grosssalary+  "|");
        System.out.println("|----------------------------------|");
        System.out.println("|----------------------------------|");

    }
}
