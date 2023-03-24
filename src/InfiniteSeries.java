public class InfiniteSeries {


    public static void main(String[] args) {
        public double myexp (double x, int n) {
            double sum = 1.0;
            double term = 1.0;

            for (int i = 1; i <= n; i++) {
                term *= x / i;
                sum += term;
            }

            return sum;
        }
        public static void check(double x) {
            System.out.println(x + " " + myexp(x, 10) + " " + Math.exp(x));
        }
            double[] values = {-0.1, -1.0, -10.0, -100.0};

            for (double x : values) {
                check(x);
            }
        }

    }
}
