package codexio;

import java.util.Scanner;

/**
 * Напишете програма, която чете от конзолата две цели числа (integer) и отпечатва,
 * колко  числа  има  между  тях,  такива,  че  остатъкът  им  от деленето на 5 да е 0.
 */
public class Problem4_4_intBetweenInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
                if((i%5==0)){
                    System.out.println(i);
                }
        }
    }
}
