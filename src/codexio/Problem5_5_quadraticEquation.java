package codexio;
/**
 * 5.Напишете програма, която при въвеждане на коефициентите (a, bи c) на квадратно уравнение:ax^2+bx+c,
 * изчислява и извежда неговите реални корени.
 */

import java.util.Scanner;
import java.lang.*;
public class Problem5_5_quadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Set A: ");
        double a = input.nextDouble();
        System.out.println("Set B: ");
        double b = input.nextDouble();
        System.out.println("Set C: ");
        double c = input.nextDouble();

        int D = (int) Math.sqrt((b*b) - (4*a*c));
        if (D==0){
            double x12= (-b)/(2*a);
            System.out.println("Квадратното уравнение има един двоен реален корен = " +x12);
        } if(D>0){
            double x1= ((-b)+ Math.sqrt(b*b - 4*a*c))/2*a;
            double x2= ((-b)- Math.sqrt(b*b - 4*a*c))/2*a;
            System.out.println("Квадратното уравнение има два реалени корена = " +x1 +" и " +x2 );
        }if (D<0){
            System.out.println("Квадратното уравнение няма реални корени");
        }

    }
}
