//  Take 'n' as input from user and print the following sequence
//  1 
//  n 
//  2 
//  n-1 
//  3 
//  n-2 
//  ...

package _03_Loops;

import java.util.Scanner;

public class _09_Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for ( int i = 1 ; i <= n; i++){
            System.out.println(i);
            System.out.println(n-i+1);
        }

        sc.close();
    }
}