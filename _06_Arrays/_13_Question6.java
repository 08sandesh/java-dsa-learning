//  Two sum

package _06_Arrays;

import java.util.Scanner;

public class _13_Question6 {
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

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

        sc.close();
    }
}
