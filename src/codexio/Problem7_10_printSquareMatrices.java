package codexio;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7_10_printSquareMatrices {
    public static void main(String[] args) {
        int[][] matrix = {  {1,4,7}, // row 0 values
                {2,5,8},
                {3,6,9}, // row 1 values

        };

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][n];
        int row, col;
        for (int i = 0; i <n*n; i++) { // Итерираме масив 'а'
            row = i%n;
            col = i/n;
            System.out.println(row);
            System.out.println(col);
            System.out.println();
            a[row][col] = i+1;
        }


        for (int i = 0; i <n; i++) { // принтираме масив 'а'
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ",  a[i][j]);
            }
            System.out.println();
        }


    }
}
