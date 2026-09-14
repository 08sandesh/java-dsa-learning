// Factorial of a number 

package _03_Loops;

import java.util.Scanner;

public class _20_Question16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int fact = 1 , i = 1;
        while(i <= n){
            fact = fact * i;
            i++;
        }

        System.out.print(fact);

        sc.close();
    }
}