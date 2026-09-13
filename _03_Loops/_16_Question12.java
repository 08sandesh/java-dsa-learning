//  Count digits of a number 

package _03_Loops;

import java.util.Scanner;

public class _16_Question12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int count = 0;

        // using for loop
        // for ( ; n != 0 ; ){
        //     n = n / 10;
        //     count = count + 1;
        // }

        // Using while loop
        while(n != 0){
            n = n / 10;
            count = count + 1;
        }

        System.out.print(count);

        sc.close();
    }
}
