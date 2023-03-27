/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

public class InfiniteSeries {

    public static double factorial(double x) {

        double result = 1;

        for (double i = x; i > 0; i--) {
            result = result * i;
        }

        return result;

    }

    public static double myexp(double x, int n) {

        double estimate = 0;

        for (int i = 0; i <= n; i++) {

            estimate += Math.pow(x,i) / factorial(i);

        }

        return estimate;

    }

    public static double myexp2(double x, int n) {

        double estimate = 1;
        double numerator = 1;
        double denominator = 1;

        for (int i = 1; i <= n; i++) {

            numerator = numerator * x;
            denominator = denominator * i;
            estimate += numerator / denominator;

        }

        return estimate;

    }

    public static void check(double x) {

        System.out.printf("x: %.1f\tmyexp: %g\tMath.exp: %g\n", x, myexp2(x,17), Math.exp(x));

    }

    public static void main(String[] args) {


        for (double i = 0.1; i <= 100.0; i = i * 10) {

            check(i);

        }

        System.out.println();

        for (double i = -0.1; i >= -100.0; i = i * 10) {

            check(i);

        }

    }
}
