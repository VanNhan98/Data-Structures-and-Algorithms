import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyMergeSort {
    public static void main(String[] args) {
        int[] c = {1, 5, 3, 2, 8, 7, 6, 4};
        MyMergeSort s = new MyMergeSort();
        System.out.println(Arrays.toString(s.mergeSort(c, 0, c.length -1)));
    }

    public int [] merge (int [] a1, int [] a2) {
        int n = a1.length + a2.length;
        int [] result = new int[n];
        int  i =0, i1= 0, i2= 0;
        while(i  < n) {
            if(i1 < a1.length && i2 < a2.length){
                if (a1[i1]  <= a2[i2]) {
                    result[i] = a1[i1];
                    i++; i1++;
                }
                else {
                    result[i] = a2[i2];
                    i++ ; i2++;
                }
            }
            else {
                if (i1 < a1.length ) {
                    result[i] = a1[i1];
                    i++; i1++;
                }
                else {
                    result[i] = a2[i2];
                    i++ ; i2++;
                }
            }


        }
        return result;

    }


    public int [] mergeSort(int [] a, int L, int R) {
        // dieu kien dung
        if(L == R){
            int [] singleElement  = {a[L]};
            return singleElement;

        }
        System.out.println("chia ra: "+L+ " - "+R);
        int k = (L +  R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1, R);



        int [] result = merge(a1, a2);
        System.out.println(Arrays.toString(result));
        return result;
    }

    public  int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length -1 );
    }
}