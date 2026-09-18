package _06_Arrays;

public class _08_Passing_Array_To_Methods {
    public static void main(String[] args) {
        int[] x = {2,5,1,55,98};
        System.out.println(x[2]);

        change(x);

        System.out.println(x[2]);
    }

    public static void change(int[] x) {
        x[2] = 10;
    }
}
