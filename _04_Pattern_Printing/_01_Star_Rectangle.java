//  Print the given pattern
//  *****
//  *****
//  *****

package _04_Pattern_Printing;

import java.util.Scanner;

public class _01_Star_Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int r = sc.nextInt();

        System.out.print("Enter columns : ");
        int c = sc.nextInt();

        for(int i = 1 ; i <= r; i++){
            for(int j = 1 ; j <= c ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
