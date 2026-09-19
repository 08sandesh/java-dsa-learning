package _06_Arrays;

import java.util.Arrays;

public class _10_Sort_Array_BuiltIn_Method {
    public static void main(String[] args) {
        int[] x = {2,5,1,55,98};
        print_array(x);

        // sort - Ascending order
        Arrays.sort(x);

        print_array(x);
    }

    public static void print_array(int[] y) {
        for (int i = 0; i < y.length; i++){
            System.out.print(y[i] + " ");
        }

        System.out.println();
    }
}
