//  Print the given pattern
//  1
//  AB
//  123
//  ABCD
//  12345

package _04_Pattern_Printing;

import java.util.Scanner;

public class _13_Alphanumeric_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (i % 2 == 0){
                    System.out.print((char)(j+64) + "");
                }
                else{
                    System.out.print(j + "");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
