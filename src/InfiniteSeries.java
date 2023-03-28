public class InfiniteSeries {

    public static void main(String[] args) {
        // Define an array of positive x values
        double[] positiveXValues = {0.1, 1.0, 10.0, 100.0};

        // Define an array of negative x values
        double[] negativeXValues = {-0.1, -1.0, -10.0, -100.0};

        // Loop through the positive x values and invoke check with each value
        for (double x : positiveXValues) {
            check(x);
        }

        // Loop through the negative x values and invoke check with each value
        for (double x : negativeXValues) {
            check(x);
        }
    }

    // Calculates e^x by adding the first n terms of the series
    public static double myexp(double x, int n) {
        double term = 1;
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            term = term * x / i; // Calculate next term using previous term
            sum += term; // Add term to the sum
        }
        return sum;
    }

    // Displays x, myexp(x), and Math.exp(x)
    public static void check(double x) {
        int n = 1;
        double myexpResult;
        double expResult = Math.exp(x);

        do {
            myexpResult = myexp(x, n);
            n++;
        } while (Math.abs(myexpResult - expResult) > 1e-10); // Adjust n for desired accuracy

        System.out.printf("%5.1f\t%20.10f\t%20.10f\n", x, myexpResult, expResult);
    }
}

