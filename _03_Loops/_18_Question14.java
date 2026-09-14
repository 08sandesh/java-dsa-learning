// Reverse of a number 

package _03_Loops;

import java.util.Scanner;

public class _18_Question14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int reverse = 0 , digit;
        while(n != 0){
            reverse = reverse * 10;
            digit = n % 10;
            reverse = digit + reverse;
            n = n / 10;
        }

        System.out.print(reverse);

        sc.close();
    }
}
