public class InfiniteSeries {

public static double myexp(double x, int n) {

    double result = 1.0;
    double numerator = 1.0;
    double denominator = 1.0;

    for (int i = 1; i <= n; i++) {
        numerator *= x;
        denominator *= i;
        result += numerator / denominator;

    }
    return result;
}

public static void check(double x) {

    System.out.printf("%1.1f\t%1.15f\t%1.15f\n", x, myexp(x, 17), Math.exp(x));
}
    public static void main(String[] args) {
        double[] values = {0.1, 1.0, 10.0, 100.0, -0.1, -1.0, -10.0, -100.0};
        for (double value : values) {
            check(value);
        }
    }
}

