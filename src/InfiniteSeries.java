public class InfiniteSeries {

    public static double myexp(double x, int n){
        double result = 1 + x;
        for (int i=2;i<=n;i++){
            double numerator = Math.pow(x, i);
            long denominator = factorial(i);
            double combined = numerator/denominator;
            result += combined;
        }
        return result;
    }

    public static long factorial(int a){
        if(a==0){
            return 1;
        }
        long recurse = factorial(a-1);
        long result = a * recurse;
        return result;
    }
    public static void check(double x){
        System.out.printf("%f\t%.15f\t%.15f\n", x, secondMyExp((int)x,17), Math.exp(x));

    }
    public static double secondMyExp(int x, int y){
        int power = 1;
        int denominator = 1;
        double result = 1;
        for(int i = 1; i <= y; i++){
            power = power * x;
            denominator = denominator * i;
            result = result + (double)power/denominator;

        }
        return result;
    }

    public static void main(String[] args) {
        double c = 0.1;
        for (int b=0; b<=3; b++){
            check(c);
            c = 10 *c;
        }
        double c2 = -0.1;
        for (int b=0; b<=3; b++){
            check(c2);
            c2 = 10 *c2;
        }
        System.out.println("For both checks on value, the closer the x value is to 1, the greater the accuracy");
    }
}
