public class InfiniteSeries {

    public static double myexp(double x, int n) {
        double term = 1;
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        return sum;
    }

    public static void check(double x, int n) {
        System.out.printf("%f\t%f\t%f\n", x, myexp(x, n), Math.exp(x));
    }


    public static void main(String[] args) {
        int n = 20;

        double[] testValues = {0.1, 1.0, 10.0, 100.0};
        for (double value : testValues) {
            check(value, n);
        }

        System.out.println();

        double[] testNegativeValues = {-0.1, -1.0, -10.0, -100.0};
        for (double value : testNegativeValues) {
            check(value, n);
        }
    }
}
//The accuracy of the result will vary as x varies. When x is closer to 0, the accuracy is better because the series converges more quickly.
// As x increases, the required number of terms to get an accurate estimation also increases, leading to less accurate results.
// Similarly, for negative values of x, the accuracy also decreases as the magnitude of x increases.