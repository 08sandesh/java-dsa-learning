//  If cost price & selling price of an item is input through
//  the keyboard, WAP to determine whether the seller has 
//  made profit or incurred loss or no profit no loss.
//  Also determine how much profit he made or loss he incurred.

package _02_If_Else;

import java.util.Scanner;

public class _07_Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();

        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();

        double percent_p = (double)(sp-cp)/cp*100;
        double percent_l = (double)(cp-sp)/cp*100;

        if (sp - cp > 0){
            System.out.println("Profit of " + (sp-cp));
            System.out.println(percent_p);
        }
        else if (sp - cp < 0){
            System.out.println("Loss of " + (cp-sp));
            System.out.println(percent_l);
        }
        else{
            System.out.println("No profit no loss");
        }

        //  Note we can also use multiple if statements

        sc.close();
    }
    
}
