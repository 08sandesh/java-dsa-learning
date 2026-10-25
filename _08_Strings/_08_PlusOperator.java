package _08_Strings;

public class _08_PlusOperator {
    public static void main(String[] args) {
        String s = "Sandesh";

        s = s + 7300;
        s += "Choudhari";
        s += '\n';
        s += "Bye";
        s += 0.12;
        System.out.println(s);

        System.out.println("SANDESH" + 73 + 1);
        System.out.println("SANDESH" + (73 + 1));
        System.out.println(1 + "SANDESH" + 73);
        System.out.println(1 + 73 + "SANDESH");
    }
}
