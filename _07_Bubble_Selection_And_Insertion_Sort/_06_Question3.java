package _07_Bubble_Selection_And_Insertion_Sort;

public class _06_Question3 {

    public static void print(int[] arr){

        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,4,1,9,6,-3,6,5};

        print(arr);

        int n = arr.length;
        for (int i = n-1; i > 0; i--){
            int largest = Integer.MIN_VALUE, maxdx = 0;
            for (int j = i; j >= 0; j--){
                // Find largest element
                if (largest < arr[j]){
                    largest = arr[j];
                    maxdx = j;
                }
            }
            //  Swap
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }
        print(arr);
    }
}
