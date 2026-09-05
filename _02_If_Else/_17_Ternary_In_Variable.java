package _02_If_Else;

import java.util.Scanner;

public class _17_Ternary_In_Variable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();

        // int n2;
        // if (n1>=0) n2 = 100;
        // else n2 = 0;

        int n2 = (n1>=0) ? 100 : 0;
        System.out.print(n2);

        sc.close();
    }
}
