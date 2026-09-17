package _06_Arrays;
import java.util.Scanner;
public class _02_Input_Output {
    public static void main(String[] args) {
        //  Output
        int[] arr = {3,2,-88,56,43,-90};

        for(int i = 0 ; i < 6 ; i++){
        System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] arr1 = {1,7,0,5,2};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        //  Input
        int[] arr2 = new int[5];  // Default value is 0
        Scanner sc = new Scanner(System.in);

        for( int i = 0 ; i < 5 ; i++){
            arr2[i] = sc.nextInt();
        }
        //  Print
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}