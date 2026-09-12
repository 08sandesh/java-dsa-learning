//  WAP to check if a given number is composite or not

package _03_Loops;

import java.util.Scanner;

public class _12_Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean flag = true; 

        for ( int i = 2 ; i <= Math.sqrt(n) ; i++){
            if ( n % i == 0){
                flag = false;
                break;
            }
        }
        
        if (n == 1) System.out.print("Neither Prime nor Composite number");
        else if (flag == false) System.out.print("Composite number");
        else System.out.print("Prime number");

        sc.close();
    }
}
