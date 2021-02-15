package codexio;
/**
 * 6.Напишете  програма,  която  намира  най-голямото  по  стойност  число измежду дадени 5 числа.
 */

import java.util.Scanner;

public class Problem5_6_bigestInFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set A: ");
        double a = input.nextDouble();
        System.out.println("Set B: ");
        double b = input.nextDouble();
        System.out.println("Set C: ");
        double c = input.nextDouble();
        System.out.println("Set D: ");
        double d = input.nextDouble();
        System.out.println("Set E: ");
        double e = input.nextDouble();

        System.out.println("The biggest number is: ");

        if (a >=b && a>=c && a>=d && a>=e){
            System.out.println("a= " + a);
        }if(b >= a && b >= c && b >= d && b >= e){
            System.out.println("b = " + b);
        }if(c >= a && c >= b && c >= d && c >= e){
            System.out.println("c = " + c);
        }if(d >= a && d >= b && d >= c && d >= e){
            System.out.println("d = " + d);
        }if(e >= a && e >= b && e >= c && e >= d){
            System.out.println("e = " + e);
        }

    }
}
//TODO да се оптимизира кода!