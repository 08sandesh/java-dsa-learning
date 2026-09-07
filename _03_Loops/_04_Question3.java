//  Print all even numbers from 1 to 100

package _03_Loops;

public class _04_Question3 {
    public static void main(String[] args){
        // Bad method (it will iterate 100 times):

        // for (int i = 1 ; i < 101 ; i++){ 
        //     if ( i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }

        // Good method (it will iterate 50 times):

        for (int i = 2 ; i < 101 ; i = i + 2){
            System.out.print(i + " ");
        }
    }
}
