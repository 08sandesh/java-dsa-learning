//  Palindrome String

package _08_Strings;

import java.util.Scanner;

public class _04_Question2 {

    public static boolean isPalindromeOrNot(String s){

        int i = 0, j = s.length()-1;
        while (i<=j) {
            if (s.charAt(i) == s.charAt(j)){
                return true;
            }
            i++;
            j--;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        if (isPalindromeOrNot(s) == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
