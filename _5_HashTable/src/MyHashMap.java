import java.util.ArrayList;
import java.util.Objects;

public class MyHashMap {

    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets [];

    class Data {
        int key ;
        int value ;
        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Data [key=" + key + ", value=" + value + "]";
        }

        @Override
        public boolean equals(Object o) {
         if(o instanceof Data) {
             return this.key == ((Data) o).key;
         }
         return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public MyHashMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key) {
        return key % SIZE;

    }

    public Data put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myData = new Data(key, value);
        int keyIndex = bucket.indexOf(myData);
        if (keyIndex >= 0) {
            Data existingData = bucket.get(keyIndex);
            existingData.value = value;
            return existingData;
        } else {
            bucket.add(myData);
            return myData;
        }
    }


    public void remove(int key) {
        int hashValueInndex = hashFunction(key);
        var bucket = myBuckets[hashValueInndex];
        Data removeData = new Data(key, 0);
        int keyIndex = bucket.indexOf(removeData);
        if (keyIndex >= 0) {
            bucket.remove(removeData);
        }
    }

    public int get(int key) {
        int hashValueInndex = hashFunction(key);
        var bucket = myBuckets[hashValueInndex];
        Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);
        if(keyIndex >= 0 ) {
            return bucket.get(keyIndex).value;
        }

        return -1;
    }

    public boolean contains(int key) {
        int hashValueIndex  = hashFunction(key);
        var bucket  = myBuckets[hashValueIndex];
        Data findData = new Data(key, 0);
        if (bucket.contains(findData)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        System.out.println(myHashMap.put(1,1));
        System.out.println(myHashMap.put(1,2));
        System.out.println(myHashMap.put(10,2));

        myHashMap.remove(1);
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(10));
        System.out.println(myHashMap.contains(2));


    }
}
