//  Take positive integer input and tell if it is odd or even.

package _02_If_Else;

import java.util.Scanner;

public class _03_Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
        
        sc.close();
    }
}
