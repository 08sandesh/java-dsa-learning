//  Most frequent character : Method 1 - Brute Force

package _08_Strings;

public class _19_Question11Method1 {

    public static char getMostOccuringChar(String s) {

        int maxCount = 0, n = s.length();
        char ans = s.charAt(0);

        for (int i = 0; i < n; i++) {
            int count = 1;
            char ch = s.charAt(i);

            for (int j = i+1; j < n; j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                ans = ch;
            }

            else if (count == maxCount && ans > ch) {
                ans = ch;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "sagar";

        System.out.println(getMostOccuringChar(s));
    }
}
