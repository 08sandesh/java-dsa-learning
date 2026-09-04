//  Take 3 positive integers input and tell 
//  if they can be the sides of a triangle or not

package _02_If_Else;

import java.util.Scanner;

public class _12_Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 : ");
        int s1 = sc.nextInt();

        System.out.print("Enter side 2 : ");
        int s2 = sc.nextInt();

        System.out.print("Enter side 3 : ");
        int s3 = sc.nextInt();

        if ((s1+s2 > s3) && (s2+s3 >s1) && (s3+s1 > s2)){
            System.out.print("Valid triangle");
        }
        else{
            System.out.print("Invalid triangle");
        }

        //  Note : Arithmatic operators have more priority 
        //  than relational operator

        sc.close();
    }
}