//  Two sum - pair with given sum

package _07_Bubble_Selection_And_Insertion_Sort;

import java.util.Scanner;
import java.util.Arrays;

public class _07_Question4 {

    public static boolean TwoSum(int[] arr, int target){
        Arrays.sort(arr);  // time = nlogn , space = n

        int n = arr.length, i = 0, j = n-1;
        while (i<j){  // time = n
            if (arr[i]+arr[j] > target){
                j--;
            }
            else if (arr[i]+arr[j] < target){
                i++;
            }
            if (arr[i]+arr[j] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int[] arr = {94,34,2,44,0,-6}; // -6 0 2 34 44 94

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        System.out.println(TwoSum(arr, target));
        sc.close();
    }
}
// Time Complexity

//  Sort -> O(nlogn)
//  loop -> O(n)
//  O(nlogn) + O(n) = O(nlogn)
