package codexio;
/**
 * 1.Напишете програма, която отпечатва на конзолата числата от 1 до N. Числото N се чете от стандартния вход.
 */

import java.util.Scanner;

public class Problem6_1_print1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
