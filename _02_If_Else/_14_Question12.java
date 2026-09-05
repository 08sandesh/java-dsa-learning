//  Given a point (x,y) WAP to find out if it lies in the 
//  1st quadrant, 2nd quadrant, 3rd quadrant, 4th quadrant,
//  on the x-axis, y-axis or at the origin

package _02_If_Else;

import java.util.Scanner;

public class _14_Question12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x value : ");
        int x = sc.nextInt();

        System.out.print("Enter y value : ");
        int y = sc.nextInt();

        if (x>0 && y>0){
            System.out.print("1st quadrant");
        }
        else if (x<0 && y>0){
            System.out.print("2nd quadrant");
        }
        else if (x<0 && y<0){
            System.out.print("3rd quadrant");
        }
        else if (x>0 && y<0){
            System.out.print("4th quadrant");
        }
        else if (x==0 && y==0){
            System.out.print("At the origin");
        }
        else if (y==0){
            System.out.print("On the x-axis");
        }
        else if (x==0){
            System.out.print("On the y-axis");
        }

        sc.close();
    }
}
