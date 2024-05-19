public class _509_fibonacci_number {
    public static void main(String[] args) {
        System.out.println(Fibo(4));
    }

    public static int Fibo(int n) {
        if (n == 0 )
            return 0 ;
        if ( n <= 2)
            return 1;
        return Fibo(n - 1) + Fibo(n -2);
    }

}
