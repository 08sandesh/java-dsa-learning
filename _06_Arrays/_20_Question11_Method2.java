//  Segregate 0s and 1s

package _06_Arrays;

public class _20_Question11_Method2 {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0,0,1,1,0,0};

        //  Two pointer method
        int l = arr.length;
        int i = 0, j = l-1;
        while(i<j){
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else if (arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
