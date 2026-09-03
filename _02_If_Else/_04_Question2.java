//  Take positive integer input and tell if it is divisible by 5 or not

package _02_If_Else;

import java.util.Scanner;

public class _04_Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check whether it is divisible by 5 or not : ");
        int num = sc.nextInt();

        if (num % 5 == 0) System.out.println(num + " is divisible by 5");
        else System.out.println(num + " is divisible by 5");

        sc.close();
    }
}
