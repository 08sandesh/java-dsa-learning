//  Common elements

package _07_Bubble_Selection_And_Insertion_Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_Question5 {

    public static ArrayList<Integer> commonElements(int a[],int b[]){
        ArrayList<Integer> c = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int len_a = a.length, len_b = b.length, i = 0, j = 0;
        while (i < len_a && j < len_b) {
            if (a[i] == b[j]) {
                c.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int a[] = {3,6,1,7,9,8,2,2}; // 1 2 2 3 6 7 8 9
        int b[] = {9,7,3,4,9};       // 3 4 7 9 9

        System.out.println(commonElements(a,b));
    }
} 
