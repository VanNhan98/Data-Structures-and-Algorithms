// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bubble_Sort {
    public static void main(String[] args) {
        int [] a = {3,7,2,8,1,5,3};
        bubbleSort(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void bubbleSort (int [] a) {
        int n = a.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i -1  ; j++) {
                if (a[j + 1] < a[j]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }

            }
        }

    }
}