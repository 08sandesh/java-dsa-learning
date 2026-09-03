//  Take real number input and check if it is an integer or not

package _02_If_Else;

import java.util.Scanner;

public class _06_Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        double n = sc.nextDouble();

        if ((int)n == n) System.out.print("Integer");
        else System.out.print("Not integer");

        sc.close();

    }
}
