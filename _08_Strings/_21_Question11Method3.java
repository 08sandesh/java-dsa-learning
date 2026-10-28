//  Most frequent character : Method 3 - Hashmap method

package _08_Strings;

public class _21_Question11Method3 {

    public static char getMostOccuringChar(String s) {
        int maxCount = 0, n = s.length();
        char ans = s.charAt(0);

        int freq[] = new int[26];

        int i = 0;
        while (i < n) {
            freq[s.charAt(i) - 97]++;
            i++;
        }

        int j = 0;
        while (j < freq.length) {
            int count = freq[j];
            if (count > maxCount) {
                maxCount = count;
                ans = (char)(j + 97);
            }
            j++;
        }
        for (int ele : freq) {
            System.out.print(ele + " ");
        }

        System.out.println(maxCount);

        return ans;
    }
    public static void main(String[] args) {
        String s = "ababaazozuizzi";

        System.out.println(getMostOccuringChar(s));
    }
}
