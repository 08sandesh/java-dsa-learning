//  Reverse StringBuilder

package _08_Strings;

public class _17_Question9 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Sandesh");
        
        // Method 1:
        // int i = 0, j = s.length()-1;
        // while(i <= j) {
        //     char temp = s.charAt(i);
        //     s.setCharAt(i,s.charAt(j));
        //     s.setCharAt(j,temp);
        //     i++; j--;
        // }
        // System.out.println(s);

        // Method 2:
        s.reverse();
        System.out.println(s);
    }
}
