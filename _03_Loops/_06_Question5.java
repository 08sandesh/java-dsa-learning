//  Display this AP - 2,5,8,11.. upto 'n' terms

package _03_Loops;

import java.util.Scanner;

public class _06_Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        //  Method 1 - using formula
        for ( int i = 2 ; i <= 3*n-1 ; i+=3 ){
            System.out.print(i + " ");
        }

        System.out.println("");
        
        //  Method 2 - without using formula
        int a = 2 , d = 3;
        for ( int j = 1 ; j <= n ; j++){
            System.out.print(a + " ");
            a = a + d;
        }

        sc.close();
    }
}
