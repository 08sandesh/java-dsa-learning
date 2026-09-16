//  Take 'n' and 'r' as input and print nCr and nPr

package _05_Methods;

import java.util.Scanner;

public class _07_Question2 {

    public static int Fact(int c){
        
        int i = 1 , fact_c = 1;
        while(i <= c){
            fact_c = fact_c * i;
            i++;
        }

        return fact_c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int n_r = n - r;

        if (n >= r && n >= 0 && r >= 0) {
            int nCr = Fact(n)/(Fact(r) * Fact(n_r));
            System.out.println("nCr : " + nCr);

            int nPr = Fact(n)/ Fact(n_r);
            System.out.println("nPr : " + nPr);
        }

        else System.out.println("Invalid input");

        sc.close();
    }
}
