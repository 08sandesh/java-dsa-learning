//  Missing in array

package _06_Arrays;

public class _18_Question10 {
    public static void main(String[] args) {
        int arr[] = {1,8,2,4,5,3,7};
        int n = arr.length;

        int sum_arr = 0;
        for (int i = 0; i < n; i++){
            sum_arr += arr[i];
        }

        int sum_num = 0;
        for (int i = 1; i <= n+1; i++){
            sum_num += i;
        }

        System.out.println(sum_num);
        System.out.println(sum_arr);

        int missing = sum_num - sum_arr;
        System.out.println(missing);
    }
}
