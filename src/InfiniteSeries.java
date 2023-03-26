import javax.swing.plaf.synth.SynthLookAndFeel;

public class InfiniteSeries {


    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            double diff = Math.abs(myexp(1, i) - Math.exp(1));
            System.out.println(i + "\t" + diff);
        }

        // It starts out accurate but after x = 10.0 it adds alot more decimal numbers.
        double[] xs = {0.1, 1.0, 10.0, 100.0};
        for (double x : xs) {
            check(x);
        }

        // As the variable gets more negative the answers get less accurate and the Math.exp method doubles the amount of decimals then the myexp method
        double[] negXs = {-0.1, -1.0, -10.0, -100.0};
        for (double x : negXs) {
            check(x);
        }
    }

    public static double myexp(double x, int n) {
        double result = 1.0;
        double numer= 1.0;
        double denom = 1.0;
        for (int i = 1; i <= n; i++) {
            numer *= x;
            denom *= i;
            result += numer / denom;
        }
        return result;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static void check(double x) {
        double myexp = myexp(x, 20);
        double mathExp = Math.exp(x);

        System.out.print("x\t\t");
        System.out.print("myexp(x)\t\t\t\t");
        System.out.println("Math.exp(x)");

        System.out.print(x + "\t\t");
        System.out.print(myexp + "\t\t");
        System.out.println(mathExp);
    }
}
