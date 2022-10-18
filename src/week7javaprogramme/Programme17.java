package week7javaprogramme;
/*Write a Java program to sort a numeric array and a string array.

 */

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {
        numeric();
    }
    public static void numeric(){
        int[]num={8,4,6,7,2};
        String[]strings={"chennai","ahemdabad","kota","bombay"};

        Arrays.toString(num);
        Arrays.toString(strings);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(strings));

        Arrays.sort(num);//The default sort order is ascending, built upon converting the elements into strings
        Arrays.sort(strings);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(strings));
    }
}
