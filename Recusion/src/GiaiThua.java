// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GiaiThua {
    public static void main(String[] args) {
        System.out.println(giaiThua(4));
    }

    public static int giaiThua (int n) {
        if (n == 0) {
            return 1;
        }
        return n * giaiThua(n -1);
    }
}