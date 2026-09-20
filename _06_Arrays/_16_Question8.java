//  Reverse an array

package _06_Arrays;

public class _16_Question8 {
    public static void main(String[] args) {
        int arr[] = {23,9,77,0,54,1,6};

        //  Two pointer technique
        int i = 0 , j = arr.length - 1 , temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
