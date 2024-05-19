import java.util.HashMap;
import java.util.Map;

public class _387_first_unique_character_in_a_string {
    public static void main(String[] args) {
        String s = "nhanh";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
//        Map<Character, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < s.length() ; i++) {
//            char c = s.charAt(i);
//            if(myMap.containsKey(c) == false) {
//                myMap.put(c,1);
//            }
//            else {
//                int count = myMap.get(c);
//                count ++;
//                myMap.put(c, count);
//            }
//        }
//
//        for (int i = 0; i < s.length() ; i++) {
//            char c = s.charAt(i);
//            if(myMap.get(c) == 1) {
//                return i;
//            }
//        }
//        return -1;
        int []count = new int[128];
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            count[c]++;
        }

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(count[c] == 1) {
                return i;
            }
        }

        return  -1;
    }
}
