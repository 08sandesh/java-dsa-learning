//  Segregate 0s and 1s

package _06_Arrays;

public class _19_Question11 {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0,0,1,1,0,0};

        int count_0 = 0, count_1 = 0;
        for (int ele : arr){
            if (ele == 0){
                count_0++;
            }
            else {
                count_1++;
            }
        }

        System.out.println(count_0 + " " + count_1);

        int i = 0;
        while (count_0 != 0) {
            arr[i] = 0;
            i++;
            count_0--;
        }

        int j = arr.length-1;
        while (count_1 != 0){
            arr[j] = 1;
            j--;
            count_1--;
        }

        System.out.println(count_0 + " " + count_1);

        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
