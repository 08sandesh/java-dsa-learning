//  Print the given pattern
//  *******
//  *     *
//  *     *
//  *     *
//  *******

package _04_Pattern_Printing;

import java.util.Scanner;

public class _15_Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        System.out.print("Enter c : ");
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++){
                if (i == 1 || i == r || j == 1 || j == c){
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