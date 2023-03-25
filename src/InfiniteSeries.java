/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 3/25/2023
 */

import java.util.Scanner;
public class InfiniteSeries {


    public static double myexp(double x, double n) {
        double estimate = 1;
        double a = 1;
        double b = 1;
        for (int i=1;i<n;i++){
            estimate += (a*=x)/(b*=i);
        }
        return estimate;
        }

    public static void check(double i) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter power of e to be estimated:");
        double x = s.nextDouble(); //power
        System.out.println(x+"\t"+myexp(x, i)+"\t"+Math.exp(x));

    }
    public static void checkInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter power of e to be estimated:");
        double x = s.nextDouble(); //power
        System.out.println("Enter value for n in infinite series expansion (for approximation:)");
        int i = s.nextInt(); //n for approximation
        System.out.println(x+"\t"+myexp(x, i)+"\t"+Math.exp(x));

    }
 //I did this for easier checking

    public static void main(String[] args) {
       // check(0.1);
        checkInput();


    }
}
