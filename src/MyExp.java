import java.util.stream.LongStream;

public class MyExp {

    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    public static double myexp(double x, int n) {
        double e = 0.0;
        for (int i = 0; i <= n; i++) {
            e += Math.pow(x, i) / factorialUsingStreams(i);
        }
        return e;
    }

    public static double effexp(double x, int n) {
        double e = 0.0;
        for (int i = 0; i <= n; i++) {
            e += (x - 1) * x / (x - 1) * i;
        }
        return e;
    }

    public static double check(double x) {
        System.out.print(x + "\t");
        System.out.print(myexp(x) + "\t");
        System.out.print(Math.exp(x));
    }

    public static void main(String[] args) {
        for (double x = 0.1; x <= 100.0; x *= 10.0) {

        }
    }
}

