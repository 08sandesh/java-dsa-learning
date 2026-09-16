package _05_Methods;

public class _08_Pass_by_Value {
    public static void change(int x){
        x = 12;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 2;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
