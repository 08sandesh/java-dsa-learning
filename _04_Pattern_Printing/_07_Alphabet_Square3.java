//  Print the pattern
//  AAAA
//  BBBB 
//  CCCC 
//  DDDD 

package _04_Pattern_Printing;

import java.util.Scanner;

public class _07_Alphabet_Square3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
        sc.close();
    }
}