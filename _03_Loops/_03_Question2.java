//  Print Hello 'n' times . Take 'n' input from user

package _03_Loops;

import java.util.Scanner;

public class _03_Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for ( int i = 1 ; i <= n ; i++){
            System.out.println("Hello");
        }
        
        sc.close();
    }
}
