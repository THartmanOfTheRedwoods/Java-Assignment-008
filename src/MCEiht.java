/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 * This code was written just to see if it works using the scanner for x, instead of the loop from 0.1 to 100
 *
 */

import java.util.Scanner;

public class MCEiht {

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
        Scanner anders = new Scanner(System.in);

        System.out.println("Type in a number please");
        double x = anders.nextInt();

        System.out.println("I need another number to proceed...");
        int n = anders.nextInt();

        double result = myeXp(x, n);
        double otherResult = myeXpMODDED(x, n);

        System.out.printf("With factorial method and Math.pow\n%f\t%f\t%f\n", result, Math.exp(x));
        System.out.printf("Without factorial method and Math.pow\n%f\t%f\t%f", x, otherResult, Math.exp(x));
    }
}
