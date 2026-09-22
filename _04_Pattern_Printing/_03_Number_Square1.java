//  Print the given pattern
//  1234
//  1234
//  1234
//  1234

package _04_Pattern_Printing;

import java.util.Scanner;

public class _03_Number_Square1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
