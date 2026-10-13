package _07_Bubble_Selection_And_Insertion_Sort;

public class _05_Selection_Sort {

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
        for (int i = 0; i < n-1; i++){
            int smallest = Integer.MAX_VALUE, mindx = 0;
            for (int j = i; j <= n-1; j++){
                // Finding smallest element
                if (smallest > arr[j]){
                    smallest = arr[j];
                    mindx = j;
                }
            }
            //  Swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}
