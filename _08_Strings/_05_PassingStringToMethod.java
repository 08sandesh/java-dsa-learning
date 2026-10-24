package _08_Strings;

public class _05_PassingStringToMethod {

    public static void change(String s){
        s = "Sandesh Choudhari";
    }
    public static void main(String[] args) {
        String s = "Sandesh";

        System.out.println(s);

        change(s);

        System.out.println(s);

        // Whenever we pass a String to method it is passed by value
    }
}
