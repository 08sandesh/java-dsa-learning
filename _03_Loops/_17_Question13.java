// Print sum of digits of a number 

package _03_Loops;

import java.util.Scanner;

public class _17_Question13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int sum = 0 , digit;
        while(n != 0){
            digit = n % 10;
            sum = digit + sum;
            n = n / 10;
        }

        System.out.print(sum > 0 ? sum : -sum);

        sc.close();
    }
}