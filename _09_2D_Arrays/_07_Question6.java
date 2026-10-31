//  Print the matrix in snake pattern

package _09_2D_Arrays;

public class _07_Question6 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,111,6,3}, {5,5,4212,1,4}, {3,1,8,2,6}};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                for (int j = arr[0].length-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
// 2 8 3 4 7 3 6 111 2 7 5 5 4212 1 4 6 2 8 1 3/