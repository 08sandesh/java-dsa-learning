//  Convert int to string

package _08_Strings;

import java.util.Scanner;

public class _09_Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        String s = ""; // Empty string
        s = s + n;

        System.out.println(s);

        // Built in method
        String S = Integer.toString(n);
        System.out.println(S);

        sc.close();
    }
}
