import java.util.LinkedList;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class _933_number_of_recent_calls {
    public static void main(String[] args) {

        System.out.println(ping(1));
        System.out.println(ping(100));
        System.out.println(ping(3001));
        System.out.println(ping(3002));

    }
    public static Queue<Integer> myQueue = new LinkedList<>();


    public static int ping(int t) {

        myQueue.add(t);
        while(myQueue.peek() < (t - 3000)) {
            myQueue.remove();
        }
        return myQueue.size();
    }

}