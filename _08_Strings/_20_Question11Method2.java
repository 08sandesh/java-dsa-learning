//  Most frequent character : Method 2 - Sliding Window

package _08_Strings;

import java.util.Arrays;

public class _20_Question11Method2 {

    public static char getMostOccuringChar(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        int maxCount = 0;
        char ans = ch[0];

        int i = 0, j = 0;
        while (j < ch.length) {
            int count = 0;

            if (ch[i] == ch[j]) {
                j++;
            }
            else {
                count = j-i;
                if (count > maxCount) {
                    maxCount = count;
                    ans = ch[i];
                }
                i = j;
            }
        }

        int count = j-i;
        if (count > maxCount) {
            maxCount = count;
            ans = ch[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "ababzozuizzi";

        System.out.println(getMostOccuringChar(s));
    }
}
