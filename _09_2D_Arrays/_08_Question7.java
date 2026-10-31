//  Reverse all rows of a given matrix

package _09_2D_Arrays;

public class _08_Question7 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4}, {5,6,7,8}, {9,0,1,2}};

        for (int i = 0; i < arr1.length; i++) {
            int k = 0, l = arr1[0].length-1;
            while (k < l) {
                int temp = arr1[i][k];
                arr1[i][k] = arr1[i][l];
                arr1[i][l] = temp;
                k++; l--;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
