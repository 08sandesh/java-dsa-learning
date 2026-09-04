//  Take length and breadth of rectangle as input and WAP to find
//  whether the area of rectangle is greater than its perimeter

package _02_If_Else;

import java.util.Scanner;

public class _13_Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        int l = sc.nextInt();

        System.out.print("Enter breadth : ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);

        if (area > perimeter)
            System.out.print("Area is greater");
        else if ( perimeter > area)
            System.out.print("Perimeter is greater");

        sc.close();
    }
}
