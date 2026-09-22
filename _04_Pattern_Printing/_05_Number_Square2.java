//  Print the pattern 
//  1111
//  2222
//  3333
//  4444

package _04_Pattern_Printing;

import java.util.Scanner;

public class _05_Number_Square2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
