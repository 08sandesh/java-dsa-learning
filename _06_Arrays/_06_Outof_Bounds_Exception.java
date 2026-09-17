package _06_Arrays;

public class _06_Outof_Bounds_Exception {
    public static void main(String[] args) {
        //  Array index out of bounds exception:

        //  Agar wrong index diya while accessing,
        //  printing, taking input then error will occur

        //  if len is n then index will 0 to n-1
        //  arr[-1] - error
        //  arr[n] - error

        int[] arr = {2,5,33,7,55,0};

        System.out.println(arr[-1]);
    }
}
