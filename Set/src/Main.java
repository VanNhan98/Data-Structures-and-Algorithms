import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     // không cho pt nào trùng nhau cả
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        System.out.println("size: "+mySet.size());
        // cách 1 dung for each
//        for (Integer integer : mySet) {
//            System.out.println(integer  );
//        }
        // dùng iterator để duyệt qua các pt
        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String element = String.valueOf(iterator.next());
            System.out.println(element);
        }

        // dugf for i

//        String[] array = mySet.toArray(new String[mySet.size()]);
//        for (int i = 0; i < array.length; i++) {
//            String element = array[i];
//            System.out.println(element);
//        }
    }
}