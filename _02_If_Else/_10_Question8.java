//  Take positive integer input and print:
//  Sandesh if number is divisible by 5
//  Kalpesh if number is divisible by 3
//  Praneeth if number is divisible by 5 & 3 both
//  Pratham if number is not divisible by 5 or 3 

package _02_If_Else;

import java.util.Scanner;

public class _10_Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 3 == 0) 
            System.out.print("Praneeth");
        else if (n % 5 == 0) 
            System.out.print("Sandesh");
        else if (n % 3 == 0) 
            System.out.print("Kalpesh");
        else 
            System.out.print("Pratham");

        sc.close();
    }
}
