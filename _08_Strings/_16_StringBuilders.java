package _08_Strings;

// import java.util.ArrayList;

public class _16_StringBuilders {
    public static void main(String[] args) {
        // ArrayList:
        // ArrayList<Character> s = new ArrayList<>();
        // s.add('S');
        // s.add('C');
        // System.out.println(s);
        
        StringBuilder s = new StringBuilder(); // by default capacity is 16
        System.out.println(s.length()+ " " +s.capacity());

        s.append("Sandesh");

        System.out.println(s.length()+ " " +s.capacity());
        System.out.println(s);

        s.setCharAt(0,'s');
        System.out.println(s);

        String str = s.toString();
        System.out.println(str);

        s.deleteCharAt(3);
        System.out.println(s);

        s.insert(3, 'd');
        System.out.println(s);

        s.delete(3, 7); // 3 to 6
        System.out.println(s);
    }
}
