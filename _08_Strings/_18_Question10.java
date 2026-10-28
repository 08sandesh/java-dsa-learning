//  Anagram

package _08_Strings;

import java.util.Arrays;

public class _18_Question10 {

    public  static boolean Anagram(String s3, String s4){

        if (s3.length() != s4.length()) return false;

        char arr1[] = s3.toCharArray();
        char arr2[] = s4.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        System.out.println(Anagram(s1,s2));
    }
}
