package _02_If_Else;

import java.util.Scanner;

public class _16_Ternary_Operator {
    public static void main(String[] args){
        //  Ternary operator ( Shortcut of if else )
        //  Syntax :-
        //  condition ? sach : jhoot

        //  Take positive integer input and tell if it is odd or even

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print((n%2 == 0) ? "Even" : "Odd");

        sc.close();
    }
}
