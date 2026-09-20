// Search in array

package _06_Arrays;

import java.util.Scanner;

public class _12_Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to search : ");
        int target = sc.nextInt();

        int arr[] = {4,6,3,0,3,1};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.print("Exist");
        }
        else {
            System.out.print("Does not exist");
        }

        sc.close();
    }
}
