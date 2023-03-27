/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 3/21/2023
 * @since version 1.0
 */

public class InfiniteSeries {
    public static double myexp(double x, double n) { //Write a method called **myexp** that takes **x** and **n** as parameters
        double XxxX = x;
        double numerator = x; //**numerator**
        double denominator = 1; //**denominator**

        for (double i = 2; i <=n; i++) {
            x += (numerator * XxxX) / (denominator * i); //**same as its predecessor multiplied by x**,
            denominator *= i;
            numerator *= XxxX;
        }
        return (x +1);
    }

    public static void check(double x) { //Write a method called **check** that takes a parameter, **x**,
        System.out.println(myexp(x, 17));//and displays **x, myexp(x)**,
        System.out.println(Math.exp(x)); //and **Math.exp(x)**.
    }
    public static void main(String[] args) { //Write a loop in main that invokes check with the values 0.1, 1.0, 10.0, and 100.0.
        check(1);
        System.out.println("Check 1:");
        double b = 0.01;
        for (int i = 0; i < 4; i++) {
             b *= 10;
            System.out.println(b);
            check(b);
        }
        System.out.println("Check 2:"); //Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0, and -100.0.
        b = -0.01;
        for (int i = 0; i < 4; i++) {
            b *= 10;
            System.out.println(b);
            check(b);
                    }

    }
}
