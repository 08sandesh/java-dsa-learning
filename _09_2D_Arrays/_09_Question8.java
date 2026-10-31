//  Snake print column wise

package _09_2D_Arrays;

public class _09_Question8 {
    public static void main(String[] args) {
        int[][] arr = {{9,5,1,3}, {77,0,34,12}, {8,6,21,6}};

        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            else {
                for (int k = arr.length-1; k >= 0; k--) {
                    System.out.print(arr[k][i] + " ");
                }
            }
            System.out.println();
        }
    }
}
//  9 77 8
//  6 0 5
//  1 34 21
//  6 12 3