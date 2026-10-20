//  Kth smallest

package _07_Bubble_Selection_And_Insertion_Sort;

import java.util.Scanner;

public class _09_Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,3,1,20,16};

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        int n = arr.length;
        for (int i = 0; i < k; i++){
            int smallest = Integer.MAX_VALUE, mindex = 0;
            for (int j = i; j < n; j++){
                if (smallest > arr[j]){
                    smallest = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }

        System.out.println(arr[k-1]);

        sc.close();
    }
}
