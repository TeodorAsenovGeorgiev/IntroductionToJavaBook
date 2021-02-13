package codexio;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 1.Напишете програма, която чете от конзолата три числа от тип int и отпечатва тяхната сума.
 */
public class Problem4_1_sumOfInts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a: ");
        int a = input.nextInt();
        System.out.println("Insert b: ");
        int b = input.nextInt();
        System.out.println("Insert c: ");
        int c = input.nextInt();

        System.out.printf("%d + %d  + %d = %d%n",a,b,c,(a + b + c));
    }


}
