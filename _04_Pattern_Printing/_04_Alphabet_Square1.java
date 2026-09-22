//  Print the pattern
//  ABCD 
//  ABCD 
//  ABCD 
//  ABCD 

package _04_Pattern_Printing;

import java.util.Scanner;

public class _04_Alphabet_Square1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 65; j <= n+64; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
        sc.close();
    }
}
