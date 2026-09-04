// Take positive integer input and tell if it is a four digit number or not.

package _02_If_Else;

import java.util.Scanner;

public class _08_Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        if (n > 999 && n < 10000) 
            System.out.print("4 digit number");
        else 
            System.out.print("Not a 4 digit number");

        sc.close();
    }
}