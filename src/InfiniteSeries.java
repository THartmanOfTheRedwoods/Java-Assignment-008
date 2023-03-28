import java.util.stream.LongStream;

/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

public class InfiniteSeries {
    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed (1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
    public static double myexp(double x, int n) {
        double e = 0.0;
        for (int i=0; i<=n; i++) {
            e += Math.pow(x, i) / factorialUsingStreams(i);
        }
        return e;
    }
    public static double expOne(double x, int n) {
        double num = 1.0;
        int den = 1;
        double e = 1;
        for (int i=1; i<= n; i++) {
            num = num * x;
            den = den * i;
            e = e + num / den;
        }
        return e;
    }
    public static void check(double x) {
        System.out.printf("x: %.1f%nmyexp: %.15f%nexpOne: %.15f%nMath.exp: %.15f%n",x,myexp(x,10),
                expOne(x,10),Math.exp(x));
    }
    public static void main(String[] args) {
        double x = 0.1;
        double y = -0.1;

        for (int i=0; i <= 3; i++) {
            check(x);
            x = x * 10.0;
        }
        for (int i=0; i <= 3; i++) {
            check(y);
            y = y * 10.0;
        }
    }
}
