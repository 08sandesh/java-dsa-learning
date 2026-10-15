//  Sort an array in descending order using bubble sort 

package _07_Bubble_Selection_And_Insertion_Sort;

public class _04_Question2 {

    public static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,4,1,-2,0,1,6,6};

        print(arr);

        int n = arr.length;
        for (int i = n-1; i > 0; i--){
            boolean isSorted = false;
            for (int j = n-1; j > 0; j--){
                if (arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSorted = true;
                }
            }
            if (isSorted == false) break;
        }
        print(arr);
    }
}
