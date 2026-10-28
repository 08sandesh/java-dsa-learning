package _08_Strings;

public class _15_InterningNew {
    public static void main(String[] args) {
        String s1 = "Sandesh";
        String s2 = "Sandesh";
        //  Note : both variables s1 & s2 points towards same value "Sandesh"
        System.out.println(s1 == s2); // returns true
        // == operator compares the address of variable

        String s3 = new String("Parth");
        String s4 = "Parth";

        System.out.println(s3 == s4); // returns false

        // use built in method: equals() - compare string char by char
        System.out.println(s3.equals(s4));
    }
}
