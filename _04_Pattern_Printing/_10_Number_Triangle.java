//  Print the given pattern
//  1
//  12
//  123
//  1234

package _04_Pattern_Printing;

import java.util.Scanner;

public class _10_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "");
            }
            System.out.println();
        }
        sc.close();
    }
}
