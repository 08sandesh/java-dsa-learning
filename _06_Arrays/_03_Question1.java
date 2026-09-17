//  Given an array , print negative elements only

package _06_Arrays;

import java.util.Scanner;

public class _03_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}