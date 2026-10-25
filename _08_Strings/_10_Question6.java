//  Count digits

package _08_Strings;

import java.util.Scanner;

public class _10_Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        String s = Integer.toString(n);

        System.out.println("Digits are " + s.length());

        sc.close();
    }
}
