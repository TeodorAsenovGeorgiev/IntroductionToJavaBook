package codexio;
/**
 * 5.Напишете  програма,  която  за  подадени  дължина  и  височина  на правоъгълник,
 * изкарват на конзолата неговият периметър и лице.
 */

import java.util.Scanner;

public class Problem3_5_rectanglePerimeterAndArea {
    public static void main(String[] args) {
        System.out.println("Java се стартира....");
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете дължината на правоъгълника:");
        double length = input.nextInt();
        System.out.println("Въведете височината на правоъгълника:");
        double height = input.nextInt();
        System.out.println("Loading...");
        double perimeter = 2*length + 2*height;
        double area = length*height;
        System.out.println("Периметъра е: "+ perimeter);
        System.out.println("Лицето е: " + area);
        System.out.println("Java се изключва...");
    }
}
