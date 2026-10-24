//  Count the number of vowels in  a given string

package _08_Strings;

import java.util.Scanner;

public class _03_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String x = sc.nextLine();

        int count = 0;
        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u'){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
