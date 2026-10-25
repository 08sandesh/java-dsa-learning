//  make compareTo method

package _08_Strings;

import java.util.Scanner;

public class _06_Question3 {

    public static int compareTo(String s1, String s2){

        int len1 = s1.length(), len2 = s2.length();
        int len = Math.min(len1, len2);

        for (int i = 0; i < len; i++){

            char ch1 = s1.charAt(i), ch2 = s2.charAt(i);
            
            if (ch1 != ch2){
                return ch1 - ch2;
            }
        }

        return len1 - len2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String s2 = sc.nextLine();

        System.out.println(compareTo(s1,s2));

        sc.close();
    }
}
