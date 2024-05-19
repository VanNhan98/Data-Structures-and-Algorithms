import java.util.HashMap;
import java.util.Map;

public class example_map {
    public static void main(String[] args) {
        String [] arr = {"nhan", "hau", "man", "suong", "nhan", "suong", "man", "suong"};
        Map<String, Integer> myMap = new HashMap<>();
        for (String i : arr) {
            if (myMap.containsKey(i) == false) {
                myMap.put(i, 1);
            } else {
                int count = myMap.get(i);
                count ++;
                myMap.put(i, count);
            }
        }
        for(Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
