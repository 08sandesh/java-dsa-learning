//  Print sum maximum elements in the array

package _06_Arrays;

import java.util.Scanner;

public class _05_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max is " + max);

        sc.close();
    }
}