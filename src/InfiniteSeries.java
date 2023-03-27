import java.util.Scanner;

public class InfiniteSeries {


    /**
     *
     * @author Trever Hartman
     * @author Ander Stanley-Camba
     * @since 2023-03-26
     * @since version 1.0
     */

    public static double myFac(int num) {

        int fac = 1;
        for (int x = num; x > 0; x--) {
            fac = fac * x;
        }

        return fac;

    }



    public static double myexp(double x, int n) throws Exception {

        if (!(n >= 0)) {
            throw new Exception();
        }


        double term = 1.0;
        double answer = 1.0;

        for (double i = 1; i < n; i++) {
            term *= x / i;
            answer += term;
        }
        return  answer;
    }


    public static void check(double x) throws Exception {

        // arg2 for myexp() is 10 because myexp(1, 10) == Math.exp(1) and if less than 10 they are !=
        System.out.printf("\n%s\n\tNumber\t|\tmyexp(number)\t|\tMath.exp(x)\n\t%-10f\t|\t%-10f\t|\t%-10f\n%s\n", "_".repeat(94), x, myexp(x, 10), Math.exp(x), "_".repeat(94));
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ e^x estimator ~~~\nPlease enter a number for x : ");
        try {
            double x = sc.nextDouble();
            System.out.println("\nGreat! Now enter a number for n terms : ");
            int n = sc.nextInt();

            System.out.printf("e^%f estimated using %d terms is : %f\n", x, n, myexp(x, n));



            double[] check1 = {0.1, 1.0, 10.0, 100.0};

            // enhanced for loop? whattt
            for (double v : check1) {
                check(v);

                // accuracy: stops being accurate at x = 10
            }


            double[] check2 = {-0.1, -1.0, -10.0, -100.0};
            for (double v : check2) {
                check(v);

                // accuracy: stops being accurate at x = 10
                // it's interesting how it gets extremely inaccurate with negative numbers when you don't have enough terms
            }
        }

        catch (Exception e) {
            System.err.println("Uh oh! That's not a valid input, please try again!\n");
            main(null);
        }

    }
}
