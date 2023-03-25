public class InfiniteSeries {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static double myexp(double x, int n) {
        double result = 1.0;
        double term = 1.0;
        int i = 1;
        while (i <= n) {
            term *= x / i;
            result += term;
            i++;
            //System.out.println(result);
        }
        return result;
    }

    public static void check(double x) {
        double myexpResult = myexp(x, 20);
        double mathexpResult = Math.exp(x);
        double diff = myexpResult - mathexpResult;
        System.out.printf("\t %.1f \t   %.5f \t%.5f\t %.5f %n", x, myexpResult, mathexpResult, diff);
        //System.out.println("x = " + x);
        //System.out.println("myexp    = " + myexpResult);
        //System.out.println("Math.exp = " + mathexpResult);
    }


    public static void main(String[] args) {
        System.out.println("=Value of X= =myexp value= =Math.exp(x)= =DIFFERENCE=");
        System.out.println("-----------------------------------------------------");
        double x1 = 0.1;
        double x2 = 1.0;
        double x3 = 10.0;
        double x4 = 100.0;

        for (int i = 1; i <= 8; i++) {
            double x;
            if (i == 1) {
                x = x1;
            } else if (i == 2) {
                x = x2;
            } else if (i == 3) {
                x = x3;
            } else if (i == 4) {
                x = x4;
            } else if (i == 5) {
                x = -x1;
            } else if (i == 6) {
                x = -x2;
            } else if (i == 7) {
                x = -x3;
            } else {
                x = -x4;
            }
            check(x);
            //System.out.println();

        }
        System.out.println();
        System.out.println("The further away x is from 0 the more inaccurate myexp method becomes");
    }
}

