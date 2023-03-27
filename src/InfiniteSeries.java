public class InfiniteSeries {
    public static void main(String[] args) {
        double[] values = {0.1, 1.0, 10.0, 100.0, -0.1, -1.0, -10.0, -100.0};
        int n = 17; // number of terms to use in the series

        for (double x : values) {
            check(x, n);
        }
    }

    public static double myexp(double x, int n) {
        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }

        return sum;
    }

    public static void check(double x, int n) {
        double actual = Math.exp(x);
        double estimated = myexp(x, n);
        // they seem to vary greatly depending on how large the number is.
        System.out.printf("%.1f\t%.15f\t%.15f\n", x, estimated, actual);
    }
}


