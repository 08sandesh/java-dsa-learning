//  Print this series - 99,95,91,87.. upto all terms which are positive

package _03_Loops;

public class _07_Question6 {
    public static void main(String[] args){

        int a = 99 , d = 4;
        for ( int i = 0 ; i <= 24 ; i++ ){
            System.out.print(a + " ");
            a = a - d;
        }
    }
}