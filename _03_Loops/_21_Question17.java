// 'a' raise to the power 'b'

package _03_Loops;

import java.util.Scanner;

public class _21_Question17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number : ");
        int base = sc.nextInt();

        System.out.print("Enter power number : ");
        int power = sc.nextInt();

        int res = 1;

        for(int i = 1 ; i <= power ; i++){
            res = base * res;
        }
        
        System.out.print(res);

        sc.close();
    }
}