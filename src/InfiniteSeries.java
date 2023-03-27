/**
 * Since Version 1.0
 * Sequoyah Schaefer
 */

import java.util.stream.LongStream;
public class InfiniteSeries{
    public static int e;
    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed (1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
    public static double MyExp(double x, int n) {
        double e = 0.0;
        double num1 = 1;
        double num2 = 1;


        for (int i = 0; i <= n; i++) {
            e += Math.pow(x ,i) / factorialUsingStreams(i);
            e += (num1*=x) / (num2*=i);


        }
        return e;

    }

    public static void check (double x) {
        int i = 7;

        System.out.println((x+"\t"+MyExp(x, i)+"\t"+Math.exp(x)));
    }



    public static void main(String[] args) {

    }
}


