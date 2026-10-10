package _07_Bubble_Selection_And_Insertion_Sort;

public class _02_Bubble_Sort {

    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,4,1,-2,0,1,6,6};

        print(arr);

        int n = arr.length;
        for (int i = 0; i <= n-2; i++){
            for (int j = 0; j <= n-2; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        print(arr);
    }
}
