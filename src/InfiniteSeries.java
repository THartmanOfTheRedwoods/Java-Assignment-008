import java.util.Scanner;

/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */

public class InfiniteSeries {
    /**
     *
     * @param n passed from i inside myeXp
     * @return a factorial
     *
     * The factorial method needed for the method myeXp
     */
     public static int factorial(int n) {

        int fax = 1;
        for (int i = 1; i <= n; i++) {
            fax *= i;
        }
        return fax;
    }

    /**
     *
     * @param x anders Scanner
     * @param n anders Scanner
     * @return result
     *
     */
    public static double myeXp (double x, int n){

        double e = 0.0;
        for (int i = 0; i <= n; i++){
            e += Math.pow(x, i) / factorial(i);
        }
        return e;
    }

    /**
     *
     * @param x anders Scanner
     * @param n anders Scanner
     * @return result
     *
     * A method that does not use Math.pow or the factorial method
     */
    public static double myeXpMODDED (double x, int n){

        double sum = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);

        System.out.print("I need a value for n: ");
        int n = ask.nextInt();

        double x;

        x = 0.1;
        while (x <= 100.0) {
            System.out.printf("%f\t%f\t%f\n", x, myeXp(x, n), Math.exp(x));
            x = x * 10;
        }

        x = -0.1;
        while (x >= -100.0) {
            System.out.printf("%f\t%f\t%f\n", x, myeXp(x, n), Math.exp(x));
            x = x * 10;
        }
    }
}
