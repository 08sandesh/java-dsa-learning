package _07_Bubble_Selection_And_Insertion_Sort;

public class _03_Bubble_Sort_Optimised {

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
        boolean isSorted = false;
        for (int i = 0; i <= n-2; i++){
            for (int j = 0; j <= n-2; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }
            if (isSorted == false) break;
        }
        print(arr);
        
        // int n = arr.length, swap = 0;
        // for (int i = 0; i <= n-2; i++){
        //     for (int j = 0; j <= n-2; j++){
        //         if (arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             swap++;
        //         }
        //     }
        //     if (swap == 0) break;
        // }

        //  Note : Time Complexity
        //         Best case : O(n)
        //         Avg case : O(n*n)
        //         worst case : O(n*n)
        
    }
}
