public class InfiniteSeries {

    // This method computes the factorial of n.
    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double myexp(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i < n; i++) {
            term *= x;
            term /= i;

            // Add the i-th term to the result.
            result += term;
        }

        return result;
    }

    // This method checks the accuracy of myexp for a given value of x.
    public static void check(double x) {
        // Compute the values of e^x using myexp and Math.exp.
        double myExpResult = myexp(x, 100);
        double mathExpResult = Math.exp(x);

        // Print
        System.out.printf("%10.1f  %20.15f  %20.15f\n", x, myExpResult, mathExpResult);
    }

    public static void main(String[] args) {
        // Find the smallest value of n that gives an accurate estimate of e^x when x=1.
        double x = 1.0;
        int n = 1;
        while (Math.abs(myexp(x, n) - Math.exp(x)) > 1E-6) {
            n++;
        }

        // Print
        System.out.printf("n=%d   myexp=%20.15f   Math.exp=%20.15f\n\n", n, myexp(x, n), Math.exp(x));

        // Check the accuracy of myexp for various values of x.
        check(0.1);
        check(1.0);
        check(10.0);
        check(100.0);

        // Check the accuracy of myexp for negative values of x.
        for (double x2 = -0.1; x2 >= -100.0; x2 *= 10) {
            check(x2);
        }
    }
}