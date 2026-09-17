package _06_Arrays;

public class _07_Array_Of_Other_DataTypes {
    public static void main(String[] args) {
        //  char a = '\0';   null character
        //  System.out.println((int)a);
        //  int x = 0;
        //  System.out.println((char)x);

        //  Array of double
        double[] arr1 = new double[4];  // default value is 0.0
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        } 

        //  Array of char
        char[] arr2 = new char[4];  // default value is null character('\u0000') (blank character when printed)
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

        //  Array of String
        String[] arr3 = new String[4];  // default value is null
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }
}
