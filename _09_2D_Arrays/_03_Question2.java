// Find the maximum element in given 2D array

package _09_2D_Arrays;

public class _03_Question2 {
    public static void main(String[] args) {
        int[][] arr = {{4,3,5}, {1,0,2}, {7,8,3}};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
