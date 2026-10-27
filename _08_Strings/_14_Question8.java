//  Sum of all substrings of a number

package _08_Strings;

import java.util.Scanner;

public class _14_Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");   
        String s = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++){
                sum = sum + Integer.parseInt(s.substring(i,j+1));
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
