package codexio;
/**
 * 6.Напишете израз, който изчислява площта на трапец по дадени a, b и h
 */
import java.util.Scanner;

public class Problem3_6_trapeze {
    public static void main(String[] args) {
        System.out.println("Java се стартира....");
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете a: ");
        double a = input.nextInt();
        System.out.println("Въведете b: ");
        double b = input.nextInt();
        System.out.println("Въведете h: ");
        double h = input.nextInt();
        System.out.println("Loading...");
        double area = (a+b)*h/2;
        System.out.println("Лицето е: " + area);
        System.out.println("Java се изключва...");
    }
}
