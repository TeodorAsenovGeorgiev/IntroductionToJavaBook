package codexio;

import java.util.Scanner;

/**
 * 11.Напишете програма, която пресмятана колко нули завършва факто-риела на дадено число. Примери:
 * N = 10 -> N! = 3628800-> 2
 * N = 20 -> N!= 2432902008176640000-> 4
 * 11.Броят на нулите зависи от това, колко пъти числото 5 е делител на факториела
 */

public class Problem6_11_zerosAfterFacturiel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        int numbersOfZero = n/5;
        System.out.println(numbersOfZero);
    }
}
