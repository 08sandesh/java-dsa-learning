package _01_Basics;

public class _11_Char_DataType {
    public static void main(String[] args){
        char c = 'A';   //  Characters are limited
        System.out.println(c);
        
        char a = '*';
        System.out.println(a);

        char b = '0';
        System.out.println(b);

        //  Typecasting - conversion of one datatype to another datatype

        char ch = 'S';
        int x = ch;   // Implicit typecasting
        
        System.out.println(x);
        
        char s = '&';
        int y = (int)s;   // Explicit typecasting

        System.out.println(y);

        //  ASCII Values :

        //  a - 97     A - 65     0 - 48
        //  .          .          .
        //  .          .          .
        //  z - 122    Z - 90     9 - 57   

        char z = '$';
        System.out.println(z + 0);  // char (operator) int = int
        System.out.println(z + z);  // char (operator) char = int

        //  int to char
        int n = 45;
        char q = (char)n;
        System.out.println(q);
    }
  
}