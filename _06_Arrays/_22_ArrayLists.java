package _06_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _22_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        //  add adds element at the last 
        arr.add(2);
        arr.add(9);
        arr.add(4);
        arr.add(55);
        arr.add(20);

        //  get is used to access element
        System.out.println(arr.get(3));

        //  set is used to update
        arr.set(4,15);
        System.out.println(arr.get(4));

        //  prints whole ArrayList using loop
        System.out.println(arr);

        //  ArrayList length
        int s = arr.size();
        System.out.println(s);

        for (int i = 0; i < s; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        //  Insert an element
        arr.add(3, 12);

        //  Remove an element
        arr.remove(arr.size()-1);

        System.out.println(arr);

        Collections.reverse(arr);

        System.out.println(arr);

        // int i = 0, j = arr.size()-1, temp;
        // while(i < j){
        //     temp = arr.get(i);
        //     arr.set(i,arr.get(j));
        //     arr.set(j,temp);
        //     i++;
        //     j--; 
        // }

        // System.out.println(arr);
    }
}
