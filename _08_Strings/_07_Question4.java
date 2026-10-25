//  Change the string

package _08_Strings;

import java.util.Scanner;

public class _07_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        char c = s.charAt(0);

        if (c >= 97 && c <= 122){
            System.out.println(s.toLowerCase());
        }
        else if (c >= 65 && c <= 90){
            System.out.println(s.toUpperCase());
        }
        else {
            System.out.println("Enter alphabets only");
        }

        sc.close();
    }
}
