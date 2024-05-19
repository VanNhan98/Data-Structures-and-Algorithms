import java.util.ArrayList;
import java.util.Arrays;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> []myBuckets;
    MyHashSet() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int hashValueIndex  = hashFunction(key);
        var bucket  = myBuckets[hashValueIndex];
        int keyIndex  = bucket.indexOf(key);
        if(keyIndex < 0) {
            bucket.add(key);
        }

    }

    public void remove(int key) {
        int HashValueIndex = hashFunction(key);
         var bucket = myBuckets[HashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key) {
        int hashValueIndex  = hashFunction(key);
        var bucket  = myBuckets[hashValueIndex];
        if (bucket.contains(key)) {
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(2);

        System.out.println(myHashSet.contains(1));
        myHashSet.remove(1);
        System.out.println(myHashSet.contains(1));




    }

}
