import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. Khai báo List
        ArrayList<Integer> lst = new ArrayList<>();

        // 2. Khai báo với số lượng phần tử ban đầu

        ArrayList<Integer> lst1 = new ArrayList<>(5);

        // 3. Khai tạo list với các pt ban đầu

        ArrayList<Integer> lst2 =  new ArrayList<>(List.of(1,2,3));

        // 4.1 add phần tử
        ArrayList<Integer> lst3 = new ArrayList<>();
        lst3.add(2);
        lst3.add(5);
        lst3.add(6);
        System.out.println("List3 mới add là:");
        System.out.println(lst3);

        // 4.2 add (index, element) vào vị trí chỉ định
        lst3.add(1,11);
        System.out.println("ls3 ms add 11 là: ");
        System.out.println(lst3);

        // 5. Trả về số phần tử của list
        System.out.println("Số phần tử của lst3: "+lst3.size());
        // 6. get (int index): trả về giá trị list tại vị trí index
        System.out.println("Vị trí só 2 của lst 3 là: "+lst3.get(2));

        // 7. remove (index)
        lst3.remove(2);
        System.out.println("lst3 sau khi xoá giá tị tại vị trí index 2: ");
        System.out.println(lst3);

        // 8. remove ( 1 phần tử được chỉ định )
        ArrayList<Integer> lst4  = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst4: "+lst4);
        lst4.remove(Integer.valueOf(3));
        System.out.println("lst4 sau khi xoá: "+lst4);

        // 9. set(index, element)
        ArrayList<Integer> lst5  = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst5: "+lst5);
        lst5.set(2,7); // vị trí cần thay, value đưa vào;
        System.out.println("lst5 sau khi set: "+lst5);

        // 10. contains(): kiểm tra collection có chưa pt nào đó hay không
        ArrayList<Integer> lst6  = new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean check = lst6.contains(4);
        System.out.println(check);

        // 11. collection.sort (): Sắp xếp tăng dần.
        ArrayList<Integer> lst7  = new ArrayList<>(List.of(19,1,23,56,31,100));
        Collections.sort(lst7);
        System.out.println("lst7 sau khi sắp xếp tắng dần: "+lst7);

        //12. collection.reverse ((: đảo nguoc
        Collections.reverse(lst7);
        System.out.println("lst7 sau khi đảo ngược: "+lst7);

        // 13. indexOf(): Tìm vị trí đầu tiên của element trong list
        // Nếu k tồn tại trả về -1.
        ArrayList<Integer> lst8  = new ArrayList<>(List.of(19,1,23,56,31));
        System.out.println("Vị trí ầu tiên của element lst8: "+lst8.indexOf(19));

        // 14.Duyệt list
        // 14.1 cách 1
        ArrayList<Integer> lst9  = new ArrayList<>(List.of(19,1,23,56,31));
        System.out.println("Lst9 dùng duyệt for");
        for (int value : lst9) {
            System.out.println(value);
        }

        System.out.println("--------------------------------");
        // 14.2 cách 2 khi dùng đến chỉ số index
        for (int i = 0; i < lst9.size(); i++) {
            System.out.println(lst9.get(i));
        }
    }
}