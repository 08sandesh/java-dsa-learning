//  Print the given pattern
//  *
//  **
//  ***
//  ****

package _04_Pattern_Printing;

import java.util.Scanner;

public class _09_Star_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
