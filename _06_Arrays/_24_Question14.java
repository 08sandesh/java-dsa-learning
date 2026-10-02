//  Merge two sorted array

package _06_Arrays;

public class _24_Question14 {
    public static void main(String[] args) {
        int a[] = {2,5,6,9,20}; 
        int b[] = {1,2,3,4,5,7,8};

        int c[] = new int[a.length + b.length];

        merge(a,b,c);

        for (int ele : c){
            System.out.print(ele + " ");
        }
    }

    public static int[] merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if(a[i] < b[j]){
                c[k] = a[i];  // or c[k++] = a[i++];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length){
            c[k++] = a[i++];
        }
        
        while (j < b.length){
            c[k++] = b[j++];
        }
        return c;
    }
}
