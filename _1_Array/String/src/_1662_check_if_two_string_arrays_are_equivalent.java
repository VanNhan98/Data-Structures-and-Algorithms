public class _1662_check_if_two_string_arrays_are_equivalent {
    public static void main(String[] args) {
        String []word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

    }

    public static boolean arrayStringsAreEqual(String[] w1, String[] w2) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for(String s1 : w1) {
                sb1.append(s1);
            }

            for (String s2 : w2) {
                sb2.append(s2);
            }

            return sb1.toString().equals(sb2.toString());
    }
}
