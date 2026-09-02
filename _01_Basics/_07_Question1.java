//  Take 2,3 numbers input and print their sum.


package _01_Basics;
import java.util.Scanner;

public class _07_Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x,y,z,sum;

        System.out.print("Enter first number : ");
        x = sc.nextDouble();

        System.out.print("Enter second number : ");
        y = sc.nextDouble();

        System.out.print("Enter third number : ");
        z = sc.nextDouble();

        sum = x + y + z;

        System.out.print("Sum is " + sum);

        sc.close();
    }
}
