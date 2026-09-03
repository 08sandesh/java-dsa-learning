//  Take integer input and print the absolute value of that integer

package _02_If_Else;

import java.util.Scanner;

public class _05_Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n >= 0) System.out.println(n);
        else System.out.println(-n);

        //  OR
        // if (n < 0){
        //     n = -n;
        // }
        // System.out.println(n);

        sc.close();
    }
}
