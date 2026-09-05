//  Take 3 positive integers input and print the greatest of them

package _02_If_Else;

import java.util.Scanner;

public class _15_Question13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();

        //  Method 1 - using if else if ladder

        // if (n1>=n2 && n1>=n3){
        //     System.out.print(n1 + " is greatest");
        // }
        // else if (n2>=n1 && n2>=n3){
        //     System.out.print(n2 + " is greatest");
        // }
        // else if (n3>=n1 && n3>=n2){
        //     System.out.print(n3 + " is greatest");
        // }

        //  Method 2 - using nested if else

        // if (n1>=n2){
        //     if (n1>=n3){
        //         System.out.print(n1 + " is greatest");
        //     }
        //     else{
        //         System.out.print(n3 + " is greatest");
        //     }
        // }
        // else{
        //     if(n2>=n3){
        //         System.out.print(n2 + " is greatest");
        //     }
        //     else{
        //         System.out.print(n3 + " is greatest");
        //     }
        // }

        //  Method 3 - using ternary operator

        System.out.println((n1>=n2) ? (n1>=n3 ? n1 : n3) : (n2>=n3) ? n2 : n3);

        sc.close();
    }
}