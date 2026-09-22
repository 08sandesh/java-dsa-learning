package _04_Pattern_Printing;

import java.util.Scanner;

public class _08_Alphabet_Square4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print((char)(i+96));
            }
            System.out.println();
        }
        sc.close();
    }   
}
