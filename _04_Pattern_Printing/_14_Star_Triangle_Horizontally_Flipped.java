//  Print the given pattern
//  ****
//  ***
//  **
//  *

package _04_Pattern_Printing;

import java.util.Scanner;

public class _14_Star_Triangle_Horizontally_Flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // for (int i = n; i >= 1; i--){
        //     for (int j = i; j >= 1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // OR
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
