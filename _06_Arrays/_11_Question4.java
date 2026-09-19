// Multiply odd indexed elements by 2 and
// add 10 to even indexed elements

package _06_Arrays;

import java.util.Scanner;

public class _11_Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements : ");

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        System.out.print("Modified array : ");
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                arr[i] += 10;
            }
            else {
                arr[i] *= 2;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
