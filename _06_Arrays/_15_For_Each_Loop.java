package _06_Arrays;

public class _15_For_Each_Loop {
    public static void main(String[] args) {
        // For each loop : 
        // 1. Used to traverse data structures
        // 2. Cannot modify elements

        int arr[] = {23,44,12,78,};

        for (int ele : arr) {
            ele = ele + 20;   // not possible
            System.out.print(ele + " ");
        }
    }
}
