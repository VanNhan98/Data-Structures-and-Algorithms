
public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int [] nums = {100,255,35,44};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int count =  0;
        for(int a : nums) {
            int num = soChuSo(a);
            if (num % 2 == 0 ) {
                count ++;
            }
        }
        return count;
    }

    static int soChuSo(int a) {
    int count = 0;
    int kq  = a;
    while(kq != 0) {
        kq = kq / 10;
        count ++;
    }
    return count;
    }

}