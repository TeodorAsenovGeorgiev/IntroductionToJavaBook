package codexio;
/**
 * 2.Напишете  програма,  която  чете  от  конзолата  радиуса "r"на  кръг  и отпечатва неговия периметър и обиколка.
 */

import java.util.Scanner;

public class Problem4_2_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Radius: ");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Area is: %f%n",area);
        System.out.printf("Perimeter is: %f",perimeter);

    }
}
