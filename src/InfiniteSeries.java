
public class InfiniteSeries {


    public static double myexp(double x, double n) {
        double Xsaver = x;

        double numerator = x;
        double denominator = 1;

        for (double i = 2; i <= n; i++) {
                x += (numerator *Xsaver)/(denominator * i);
                denominator *= i;
                numerator *= Xsaver;
        }

        return (x + 1);
    }

    public  static  void check(double x) {
        System.out.println(myexp(x, 17));
        System.out.println(Math.exp(x));
    }
    public static void main(String[] args) {
       check(1);

        System.out.println("check 1");
       double b = 0.01;
       for (int i = 0; i < 4; i++) {
           b *= 10;
           System.out.println(b);
           check(b);
           System.out.println("");
       }

        System.out.println("check 2");
        b = -0.01;
        for (int i = 0; i < 4; i++) {
            b *= 10;
            System.out.println(b);
            check(b);
            System.out.println("");
        }

    }
}
