//  Display this GP - 1,2,4,8.. upto 'n' terms

package _03_Loops;

import java.util.Scanner;

public class _08_Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= Math.pow(2,(n-1)) ; i = i * 2){
            System.out.print(i + " ");
        }

        sc.close();
    }
}
