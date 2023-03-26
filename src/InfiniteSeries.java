/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
import java.util.stream.LongStream;
public class InfiniteSeries {
    public static long factorialUsingStreams(int n){
        return LongStream.rangeClosed(1,n).
                reduce(1,(long x, long y) -> x *y);
    }
    public static double myExp(double x, int n){
        double e = 0.0;
        for(int i = 0; i <= n; i++){
            e += Math.pow(x, i)/factorialUsingStreams(i);
        }
        return e;
    }
    public static double myExp1(double x, int n){
        double numerator = 1.0;
        int denominator = 1;
        double e = 1;
        for(int i = 1; i <= n; i++){
            numerator = numerator * x;
            denominator = denominator * i;
            e = e + numerator/denominator;
        }
        return e;
    }
    public static void check(double x){
        System.out.printf("x: %.1f%nmyExp: %.15f%nmyExp1: %.15f%nMath.exp: %.15f%n"
                ,x,myExp(x,17), myExp1(x,17),Math.exp(x));
    }
    public static void main(String[] args) {
       double x = 0.1;
       double y = -0.1;
       for(int i = 0; i <= 3; i++){
           check(x);
           x = x * 10.0;
        }
       for (int i = 0; i <=3; i++){
           check(y);
           y = y * 10.0;
       }
    }
}
