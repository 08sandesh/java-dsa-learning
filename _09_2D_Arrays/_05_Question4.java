//  Find the minimum element out of all the maximum elements of each row

package _09_2D_Arrays;

public class _05_Question4 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,111,6,3}, {5,5,4212,1,4}, {3,1,8,2,6}};

        int min = 0;
        int maxInRow = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (maxInRow < arr[i][j]) {
                    maxInRow = arr[i][j];
                }
            }
            
        }
        System.out.println(min);
    }
}
