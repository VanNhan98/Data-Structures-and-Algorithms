import java.util.HashSet;
import java.util.Set;

public class _217_contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> mySet = new HashSet<Integer>();

        for (int n : nums) {
            if(mySet.contains(n)) {
                return true;
            }
            else {
                mySet.add(n);
            }
        }
    return false;

    }

    public static void main(String[] args) {
        int [] nums = {1,3,1,4};
        System.out.println(containsDuplicate(nums));
    }
}
