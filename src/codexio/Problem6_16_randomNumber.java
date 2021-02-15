package codexio;
import java.util.Random;
import java.util.Scanner;
/**
 *  * 16.Напишете програма, която по дадено число N отпечатва случайно число между 1 и N.
 */
public class Problem6_16_randomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        int minimum = 1;
        int maximum = n;

        int randomNumber = random.nextInt((n-1)+1);//randomNum = minimum + random.nextInt((maximum - minimum) + 1);

        System.out.println(randomNumber);

    }
}