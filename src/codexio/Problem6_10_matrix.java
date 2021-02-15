package codexio;

import java.util.Scanner;

/**
 * 10.Напишете програма, която чете от конзолата положително цяло число N (N < 20) и
 * отпечатва матрица с числа като на фигуратапо-долу
 */

public class Problem6_10_matrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col =row; col <= row+n-1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
