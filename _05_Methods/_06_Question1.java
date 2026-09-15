//  Build a Math.max() method of 3 arguments

package _05_Methods;

public class _06_Question1 {

    public static int max(int a , int b , int c){

        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        
        System.out.println(max(5500, 6000 , 5500));
    }
}
