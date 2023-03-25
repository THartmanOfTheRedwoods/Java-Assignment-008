/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InfiniteSeries {

    public static double factorial(int n) { // Method for determining factorials

        Double x; // Number to multiply against
        Double f = 1.0; // Initialized factorial

        /* When x is less than or equal to the input number, increase x by 1. The factorial is equal to factorial
         * multiplied by x */
        for (x = 1.0; x <= n; x++) {
            f = x * f;
        }
        return f;
    }

    public static double ogMyExp(double x, int n) { /* "a method called myExp that takes x and n as parameters and estimates
        by adding the first n terms of this series."
        x parameter is = to the exponent  */

        int i; // "iteration number"

        double e = 0; // Euler's number, aka the results of the method

        // for i starting = 1, and i having to be less than or equal to n, and every iteration (i) is increased by 1
        // e = to e + exponent (x^i) divided using factorial method taking i
        for (i = 1; i <= n; i = i + 1) {
            e = e + Math.pow(x, i) / factorial(i);
        } return e;

    }
    public static double myExp(double x, int n) { /* "a method called myExp that takes x and n as parameters and estimates
        by adding the first n terms of this series."
        x parameter is = to the exponent  */

        int i; // "iteration number"

        double term = 1.0; // the 1 in e^x = 1 + x + x^2 - I think

        double e = 0; // Euler's number, aka the results of the method

        // for i starting = 1, and i having to be less than or equal to n, and every iteration (i) is increased by 1
        for (i = 1; i <= n; i++) {

            term = term * x / i; // term starting at 1 is equal to, term multiplied by x (exponent) divided by i

            e = e + term;

            //System.out.println(result);
        }
        return e;
    }

    public static void ogCheck(double x, int n) { // Version of check method using the ofMyExp method - for comparison

        System.out.println(x + "\t" + Math.exp(x) + "\t" + ogMyExp(x, 10)); // Creates table with info from myExp etc.
        // The first column is the value of x
        // The second column is the "true" exponent value of x
        // The third column is the value of x via infinite series expansion?

    }

    public static void check(double x, int n) {
        //System.out.println(x);
        //System.out.println(myExp(x));
        //System.out.println(Math.exp(x));

        System.out.println(x + "\t" + Math.exp(x) + "\t" + myExp(x, n)); // Creates table with info from myExp etc.

    }

    public static void check(double x) { // Overloaded check method specifically for part 5 loop - n set to 10 in myExp
        // so 10 terms

        System.out.println(x + "\t" + Math.exp(x) + "\t" + myExp(x, 10)); // Creates table with info from myExp etc.
        // The first column is the value of x
        // The second column is the "true" exponent value of x
        // The third column is the value of x via infinite series expansion?

    }

    public static void ogVaryTerms() { // Version of varyingTerms method for checking ogCheck

        Scanner in = new Scanner(System.in); // Scanner object

        System.out.println("-OG Version- Enter exponent base: "); // User input for base

        double x = in.nextDouble(); // Stores base number as x

        System.out.println("-OG Version- Enter number of terms: "); // User input for number of terms to use

        int n = in.nextInt(); // Stores terms as n

        System.out.println();
        System.out.println("The first column is the value of x");
        System.out.println("The second column is the value of x using Math.pow");
        System.out.println();

        ogCheck(x, n); // Invokes check method

    }
    public static void varyTerms() {

        Scanner in = new Scanner(System.in); // Scanner object

        System.out.println("Enter exponent base: "); // User input for base

        double x = in.nextDouble(); // Stores base number as x

        System.out.println("Enter number of terms: "); // User input for number of terms to use

        int n = in.nextInt(); // Stores terms as n

        System.out.println();
        System.out.println("The first column is the value of x");
        System.out.println("The second column is the value of x using Math.pow");
        System.out.println();

        check(x, n); // Invokes check method

    }

    public static void part5Loop() {

        double x; // Creates base value variable to be tested

        System.out.println("The first column is the value of x");
        System.out.println("The second column is the value of x using Math.pow");
        System.out.println("The third column is the value of x passed to myExp method");
        System.out.println();

        for (x = 0.1; x <= 100.0; ) { // Loop that checks with the values 0.1, 1.0, 10.0, and 100.0
            check(x);
            x = x * 10; // x starting at 0.1 and X by 10 to get 0.1, 1.0, 10.0, and 100.0

        }

        for (x = -0.1; x >= -100.0;) { // Loop that checks with the values -0.1, -1.0, -10.0, and -100.0
            check(x);
            x = x * 10; // x starting at -0.1 and X by 10 to get -0.1, -1.0, -10.0, and -100.0

        }

    }

    public static void main(String[] args) {

        ogVaryTerms(); // Tests and compares "Original Gangsta" version of myExp

        varyTerms(); // Allows easy varying of terms number

        part5Loop(); // Method for part 5 and 6

        /** Accuracy gets worse as the value of x moves further away from 0.
         * Setting i = 0 gave strange results so i was set to 1 */

    }
}
