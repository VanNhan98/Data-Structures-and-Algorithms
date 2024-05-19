import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {1,3,6};
        merge(nums1,4,nums2,3 );
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] n1, int m, int[] n2, int n) {
       int i = m - 1;
       int j = n - 1;
       int k = (m + n) - 1;
       while (k >= 0) {
          if (i < 0) {
               n1[k] = n2[j];
               j--;
          } else if (j < 0) {
               n1[k] = n1[i];
               i--;
          }
          else if (n1[i] > n2[j]) {
               n1[k] = n1[i];
               i--;
          } else if (n1[i] <= n2[j]) {
               n1[k] = n2[j];
               j--;
           }
           k--;
       }

    }
}
