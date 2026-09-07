//  Print numbers from n to 1

package _03_Loops;

import java.util.Scanner;

public class _05_Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for ( int i = n ; i > 0 ; i--){
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}