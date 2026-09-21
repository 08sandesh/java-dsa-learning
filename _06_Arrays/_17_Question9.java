//  Rotate d elements in an array

package _06_Arrays;

import java.util.Scanner;

public class _17_Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {32,6,4,8,99,12,34};  // 8 99 12 34 32 6 4

        System.out.print("Enter d : ");
        int d = sc.nextInt();

        rotate(arr,0,arr.length);
        rotate(arr,0,arr.length-d);
        rotate(arr,arr.length-d,arr.length);

        for (int ele : arr){
            System.out.print(ele + " ");
        }

        sc.close();
    }

    public static void rotate(int arr[],int st,int ed){
        int i = st, j = ed-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}