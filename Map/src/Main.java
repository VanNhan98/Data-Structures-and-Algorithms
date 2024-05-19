import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Dạng table với key unique
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(222,"Nguyên van b");
        myMap.put(111,"Trần van a");
        myMap.put(333,"Hồ van c");

//        System.out.println("size: "+myMap.size());
//        for (var item: myMap.entrySet()) {
//            System.out.println(item.getKey()+" : "+item.getValue());
//        }

        // cách 2
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        // cách 3 dùng key để in ra key or values
//        for (Integer i : myMap.keySet()) {
//            System.out.println("key: " + i + " value: " + myMap.get(i));
//        }
//
//
//
//        // in ra value
//        for (String i:
//             myMap.values()) {
//
//        }


    }
}