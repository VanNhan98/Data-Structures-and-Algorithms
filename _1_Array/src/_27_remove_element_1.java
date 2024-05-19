public class _27_remove_element_1 {
    public static void main(String[] args) {
        int []nums = {3,2,1,3,2};
        System.out.println(removeElement1(nums, 2));
    }

    public static int removeElement1(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
