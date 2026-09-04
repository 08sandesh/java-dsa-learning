// Take positive integer input and tell if it is divisible by 5 or 3

package _02_If_Else;

import java.util.Scanner;

public class _09_Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if (n%5 == 0 || n%3 == 0) 
            System.out.print("Divisible by 5 or 3");
        else
            System.out.print("Not divisible");

        sc.close();
    }
}
