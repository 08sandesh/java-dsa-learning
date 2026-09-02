package _01_Basics;

import java.util.Scanner;
public class _06_Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double rad = sc.nextDouble();
        
        double area = 3.141592 * rad * rad;
        
        System.out.println("Area of circle is " + area);

        System.out.println("");
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("Square of " + num + " is " + num*num);
        
        sc.close(); // close the Scanner
    }
}
