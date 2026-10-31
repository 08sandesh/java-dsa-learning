// Print elements of 2D array column wise

package _09_2D_Arrays;

public class _06_Question5 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4}, {5,6,7,8}, {9,0,1,1}};

        for (int i = 0; i < arr1[0].length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j][i] + " ");
            }
            System.out.println();
        }
    }
}
