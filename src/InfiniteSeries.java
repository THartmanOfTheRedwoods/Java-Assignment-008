/**
 * @author crazyne55
 *
 * 3/26/2023 @ 1710
 */
public class InfiniteSeries {
    public static double myexp(double x, int n) {
        //   x^2/2!
        //   (x^2) / (2!)
        double sum = 1;
        double preX = 1;
        double preI = 1;
        for (int i = 1; i < n; i++) {
            sum += (preX *= x) / (preI *= i);
        }


        return sum;
    }

    public static void main(String[] args) {
        int n = 20;


        double[] testnums = new double[]{0.1, 1.0, 10.0, 100.0};
        for (double num : testnums) {
            double res1 = myexp(num, n);
            double res2 = Math.exp(num);
            System.out.printf("--- %6s : myexp > %21s : Math.exp > %21s%n", num, res1, res2);
        }
        testnums = new double[]{-0.1, -1.0, -10.0, -100.0};
        for (double num : testnums) {
            double res1 = myexp(num, n);
            double res2 = Math.exp(num);
            System.out.printf("--- %6s : myexp > %21s : Math.exp > %21s%n", num, res1, res2);
        }
    }
}
