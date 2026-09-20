//  Print the second maximum element in the array

package _06_Arrays;

import java.util.Scanner;

public class _14_Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        
        int s_max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (s_max < arr[i] && arr[i] != max) {
                s_max = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(s_max);

        sc.close();
    }
}
