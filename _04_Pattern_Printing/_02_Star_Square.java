//  Print the given pattern
//  ***
//  ***
//  ***

package _04_Pattern_Printing;

import java.util.Scanner;

public class _02_Star_Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int r = sc.nextInt();

        for(int i = 1 ; i <= r; i++){
            for(int j = 1 ; j <= r ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
