// Print the sum of number and its reverse 

package _03_Loops;

import java.util.Scanner;

public class _19_Question15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int clone_n = n;

        int reverse = 0 , digit;
        while(n != 0){
            reverse = reverse * 10;
            digit = n % 10;
            reverse = digit + reverse;
            n = n / 10;
        }

        System.out.println(reverse);
        System.out.println(clone_n + " + " + reverse + " = " + (reverse + clone_n));

        sc.close();
    }
}
