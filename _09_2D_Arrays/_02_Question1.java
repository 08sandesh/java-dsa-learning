//  Sum of all elements in matrix

package _09_2D_Arrays;

public class _02_Question1 {
    public static void main(String[] args) {
        int[][] arr = {{4,3,5}, {1,0,2}, {7,8,3}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
