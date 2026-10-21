//  Print the given pattern
//    *
//    *
//  *****
//    *
//    *

package _04_Pattern_Printing;

import java.util.Scanner;

public class _16_Star_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter odd no. : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == (n/2)+1 || j == (n/2)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
