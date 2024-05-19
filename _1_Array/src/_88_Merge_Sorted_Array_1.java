import java.util.Arrays;

public class _88_Merge_Sorted_Array_1 {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {1,3,6};
        merge(nums1,4,nums2,3 );
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            chenPhanTuVaoMang(ai, nums1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] nums1, int m) {
        int k = 0;
        for (int i = 0; i < m; i++) {
            if (nums1[i] != x && nums1[i] > x) {
                nums1[k] = nums1[x];
            }
        }
    }
}
