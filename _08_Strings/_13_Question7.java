//  Print all substrings

package _08_Strings;

import java.util.Scanner;

public class _13_Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        String s = sc.nextLine();

        for (int i = 0; i <= s.length(); i++){
            for (int j = i; j <= s.length(); j++){
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
