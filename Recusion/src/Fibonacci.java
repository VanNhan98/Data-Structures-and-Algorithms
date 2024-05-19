public class Fibonacci {
    public static void main(String[] args) {
        int [] Fibo =  new int[11];
        int sum = 0 ;
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i < 11 ; i++) {
            Fibo[i]  =Fibo[i-1] + Fibo[i-2];
            sum += Fibo[i];

        }
        System.out.println(Fibo[7]);

    }

//    public static int Fibo (int n) {
//        System.out.println("Cần tính F("+n+") = "+n);
//        if (n <= 2) {
//            return 1;
//        }
//        int Fn = Fibo(n -1) + Fibo(n -2);
//        return Fn;
//    }


}
