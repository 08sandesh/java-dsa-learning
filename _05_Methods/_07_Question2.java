//  Take 'n' and 'r' as input and print nCr

package _05_Methods;

import java.util.Scanner;

public class _07_Question2 {

    public static double Combination(int n , int r){
        
        int i = 1 , fact_n = 1;
        while(i <= n){
            fact_n = fact_n * i;
            i++;
        }

        int j = 1 , fact_r = 1;
        while(j <= r){
            fact_r = fact_r * j;
            j++;
        }

        int k = 1 , fact_nr = 1;
        while(k <= (n-r)){
            fact_nr = fact_nr * k;
            k++;
        }

        return fact_n / (fact_r * fact_nr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        System.out.println(Combination(n , r));

        sc.close();
    }
}
