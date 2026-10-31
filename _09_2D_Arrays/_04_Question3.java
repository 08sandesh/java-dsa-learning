//  Find the row with maximum sum

package _09_2D_Arrays;

public class _04_Question3 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,111,6,3}, {5,5,4212,1,4}, {3,1,8,2,6}};

        int max = Integer.MIN_VALUE, rowNo = -1;

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                rowSum += arr[i][j];
            }
            if (max < rowSum) {
                max = rowSum;
                rowNo = i;
            }
        }
        System.out.println(max + " " + rowNo);
    }
}
