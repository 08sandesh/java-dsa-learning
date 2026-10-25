package _08_Strings;

public class _02_BuiltInMethods {
    public static void main(String[] args) {
        String s = "Hi I am Sandesh";

        //  to access any character
        //  Note : if index does'nt exist it will produce an error
        System.out.println(s.charAt(6));

        //  to find length of String
        System.out.println(s.length());

        //  to find index of any character
        //  Note : 1. it returns index first occurence 
        //         2. if character is not present it will return -1
        System.out.println(s.indexOf('S'));

        //  to find last index
        System.out.println(s.lastIndexOf('a'));

        //  converts to lower case
        System.out.println(s.toLowerCase());

        //  converts to Upper case
        System.out.println(s.toUpperCase());

        //  returns true if substring is present else false
        System.out.println(s.contains("desh"));

        //  compare lexographically 
        System.out.println("sandesh".compareTo("sirvi"));// this will print a-i

        //  concat two strings
        System.out.println("Sandesh".concat(" Choudhari"));

        //  convert string to int
        System.out.println(Integer.parseInt("456"));
        
        //  convert int to string
        System.out.println(Integer.toString(789));
    }
}
