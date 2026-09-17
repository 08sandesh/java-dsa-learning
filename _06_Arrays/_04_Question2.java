//  Print sum of elements of the array

package _06_Arrays;

import java.util.Scanner;

public class _04_Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = arr[i] + sum;
        }

        System.out.println("Sum is " + sum);

        sc.close();
    }
}