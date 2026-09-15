package _05_Methods;

public class _05_Return_Type {
    
    public static int Return(int a){  // Here int is return type
        System.out.print("I love you ");

        // Multiple return statement
        if (a > 0) return 3000;
        else return 2000;
    }

    public static void main(String[] args) {

        int x = Return(2000);  // Method can be stored in a variable
        System.out.println(x);
    }
}
