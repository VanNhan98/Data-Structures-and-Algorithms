import java.util.Arrays;

import static java.lang.System.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyQuickSort {
    public static void main(String[] args) {
        int [] a = {6,7,8,5,4,1,2,3};
        quickSort(a,0, a.length - 1);
        out.println(Arrays.toString(a));
    }

    static void quickSort(int [] a, int L, int R) {
        // chon khoa
        if(L >= R) return;
        int key = a[(L+R)/2];

        // phan bo lai mang theo khoa
        int index = partition(a, L, R, key);

        // chia doi mang => lap lai
        quickSort(a, L, index - 1);
        quickSort(a, index, R);

    }

    static int partition (int [] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while(iL <= iR) {
                while(a[iL] < key) iL++;
                while(a[iR] > key) iR--;
                if (iL <= iR) {
                    int t = a[iL];
                    a[iL] = a[iR];
                    a[iR] = t;
                    iL++; iR--;
                }
        }

        return iL;
    }

    
}