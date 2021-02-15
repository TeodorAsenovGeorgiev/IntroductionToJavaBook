package codexio;
/**
 * 2.Напишете програма, която показва знака (+или -) от частното на две реални числа, без да гопресмята.
 */

import java.util.Scanner;

public class Problem5_2_symbolnDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set A: ");
        int a = input.nextInt();
        System.out.println("Set B: ");
        int b = input.nextInt();

        if (!(a>0)^(b<0)){
            System.out.println("-");
        }else {
            System.out.println("+");
        }
    }
}
//TODO Гордея се с това решение :))