//  Transpose of square matrix

package _09_2D_Arrays;

public class _10_Question9 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4}, {7,2,1,6}, {5,5,4,1}, {3,1,8,2}};

        int len = arr.length;
        for (int i = 0; i <len; i++) {
            for (int j = i; j < len; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
