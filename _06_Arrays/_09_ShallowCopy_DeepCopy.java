package _06_Arrays;

import java.util.Arrays;

public class _09_ShallowCopy_DeepCopy {
    public static void main(String[] args) {
        int[] x = {2,5,1,55,98};
        int[] y = x;  //  y is shallow copy of x
        y[2] = 11;
        System.out.println(x[2]);

        //  Method 1 :
        //  z is deep copy of y
        int[] z = Arrays.copyOf(y, y.length);  
        z[0] = 22;
        System.out.println(y[0]);

        //  Method 2 : 
        int[] arr = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            arr[i] = x[i];
        }
    }
}
