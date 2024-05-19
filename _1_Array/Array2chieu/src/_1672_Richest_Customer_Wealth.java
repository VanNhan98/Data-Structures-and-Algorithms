// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] a) {
        int max = 0;
        for (int i = 0; i < a.length ; i++) {
            int sumRow = 0;
            for (int j = 0; j < a[0].length ; j++) {
                sumRow += a[i][j];
            }
            if (sumRow > max) {
                max = sumRow;
            }
        }
        return max ;
    }
}