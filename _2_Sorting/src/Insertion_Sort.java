public class Insertion_Sort {
    public static void main(String[] args) {
        int [] a = {3,7,2,8,1,5,3};
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void insertionSort(int[] a) {
        int n =a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i -1;
            while(j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
        }

    }
}
