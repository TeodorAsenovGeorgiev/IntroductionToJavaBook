package codexio;
/**
 * 2.Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7.
 * Числото N се чете от стандартния вход.
 */

import java.util.Scanner;

public class Problem6_2_print1toNnoDiv3and7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 7 != 0){
                //continue;
                System.out.println(i);
            }
        }
    }
}
