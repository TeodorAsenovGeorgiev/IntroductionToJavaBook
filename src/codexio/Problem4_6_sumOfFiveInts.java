package codexio;
/**
 * 6.Напишете програма, която чете пет числа и отпечатва тяхната сума.
 */

import java.util.Scanner;

public class Problem4_6_sumOfFiveInts {
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
        System.out.println("Сбора на числата е: " + (a + b + c + d +e));
    }
}
