import java.util.Scanner;
public class InfiniteSeries {

public static double myExp(double x, int iTotal){
    double numerator = 1;
    double denominator = 1;
    double quotient = 0;
    double result = 0;
    for(int i = 1; i <= iTotal;){
    quotient = numerator / denominator;
    numerator = numerator * x;
    denominator = denominator * i;
    result += quotient;
    i++;
    }
    return result;

}
    public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Enter the number of iterations you would like to use");
    int iterations = myScan.nextInt();
    System.out.println("Positive:");
    for(double i = 0.1; i<= 100.0; i*=10) {
        System.out.printf("%f\t%f\t%f\t%n", i, myExp(i, iterations), Math.exp(i));
    }
    System.out.println("Negative:");
    for(double i = -0.1; i>= -100.0; i*=10) {
        System.out.printf("%f\t%f\t%f\t%n", i, myExp(i, iterations), Math.exp(i));
    }
    System.out.println("myExp and Math.Exp have exponentially less significant figures in agreement as the x value increases.");
    }
}
