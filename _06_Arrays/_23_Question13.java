//  Adding one

package _06_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _23_Question13 {
    public static void main(String[] args) {
        int ques[] = {9,9,9,9};

        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 1;
        for (int i = ques.length-1; i >= 0; i--){
            if (ques[i] + carry <= 9){
                ans.add(ques[i] + carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }

        if (carry == 1){
            ans.add(carry);
        }

        Collections.reverse(ans);
        System.out.println(ans);
    }
}
