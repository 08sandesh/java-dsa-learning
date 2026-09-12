//  Take a number input & print all of its factors

package _03_Loops;

import java.util.Scanner;

public class _13_Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= Math.sqrt(n) ; i++){
            if ( n % i == 0 ){
                System.out.print(i + " ");
            }
            if (n/i != i){
                System.out.print(n/i + " ");
            }
        }

        sc.close();
    }
}