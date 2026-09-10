//  Print all alphabets(A-Z) with their corresponding ASCII values

package _03_Loops;

public class _10_Question9 {
    public static void main(String[] args){
        for ( int i = 65 ; i <= 90 ; i++){
            char A = (char)i;
            System.out.println(A + " - " + i);
        }
    }
}
