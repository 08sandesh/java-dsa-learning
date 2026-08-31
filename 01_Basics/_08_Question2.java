//  Calculate simple interest

import java.util.Scanner;

public class _08_Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double p,r,t,si;

        System.out.print("Enter principal : ");
        p = sc.nextInt();

        System.out.print("Enter rate : ");
        r = sc.nextInt();

        System.out.print("Enter time : ");
        t = sc.nextInt();

        si = (p*r*t)/100;

        System.out.println("Simple interest is " + si);

        sc.close();
    }
    
}
