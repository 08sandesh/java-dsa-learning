package _06_Arrays;

public class _01_Basics {
    public static void main(String[] args) {
        //  Array - 1. Array is a linear data structure
        //          2. Array are mutable

        // Method 1 - Declaration & initialization
        int[] x = {3,2,-88,56,43,-90};  

        //  3 2 88 56 43 90
        //  0 1 2  3  4  5  - Indexing
        //  Indexing starts from 0
        //  Here length of array is 6

        //  Accessing elements of array
        System.out.println(x[0]);
        
        //  Updating elements
        x[5] = 22;
        System.out.println(x[5]);

        //  Method 2 - Declaration
        int[] arr = new int[5];
        //  Initialize individually
        arr[0] = 8;
        arr[2] = -55;
        arr[3] = 76;
        arr[4] = 1;
        arr[5] = 42;
    }
}
