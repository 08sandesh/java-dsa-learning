//  Check if array is sorted

package _07_Bubble_Selection_And_Insertion_Sort;

public class _01_Question1 {

    public static boolean arraySortedOrNot(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {-2,0,3,5,7,9};

        System.out.println(arraySortedOrNot(arr));
    }
}
