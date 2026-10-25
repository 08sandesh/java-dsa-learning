package _08_Strings;

public class _11_StringToCharArray {
    public static void main(String[] args) {
        String str = "Sandesh";
        // char[] arr = new char[str.length()];

        // for (int i = 0; i < str.length(); i++) {
        //     arr[i] = str.charAt(i);
        // }

        //  Built in method
        char[] arr = str.toCharArray();
        
        for (char ele : arr){
            System.out.print(ele);
        }
    }
}
