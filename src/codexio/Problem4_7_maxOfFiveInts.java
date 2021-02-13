package codexio;

import java.util.Scanner;

/**
 * 7.Напишете програма, която чете пет числа и отпечатва най-голямото от тях.  Забележка:  трябва  да  използватеконструкция "if",  която  до момента не сме разгледали.
 */
public class Problem4_7_maxOfFiveInts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a = ");
        int a = input.nextInt();
        System.out.printf("Enter b = ");
        int b = input.nextInt();
        System.out.printf("Enter c = ");
        int c = input.nextInt();
        System.out.printf("Enter d = ");
        int d = input.nextInt();
        System.out.printf("Enter e = ");
        int e = input.nextInt();
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
