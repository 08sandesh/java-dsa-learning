package _08_Strings;

import java.util.Scanner;

public class _01_StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Char array = String

        // String s = "Hi I am Sandesh";
        // System.out.println(s);

        System.out.print("Enter string : ");
        String x = sc.nextLine();
        System.out.println(x);

        System.out.print("Enter string : ");
        String y = sc.next();   // does'nt read after a space
        System.out.println(y);

        sc.close();
    }
}
