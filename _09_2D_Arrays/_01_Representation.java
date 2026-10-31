package _09_2D_Arrays;

import java.util.Scanner;

public class _01_Representation {
    public static void main(String[] args) {
        //  2D Array / Matrix / Grid :- array of arrays

        //  arr[i][j]
        //  i = rows, j = columns

        int[][] arr1 = new int[3][4];
        // int[][] arr2 = {{1,2,3,4}, {5,6,7,8}, {9,0,1,1}};

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Output using foreach loop
        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            for (int ele : arr1[i]) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
