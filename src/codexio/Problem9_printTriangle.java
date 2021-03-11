package codexio;

import java.util.Scanner;

public class Problem9_printTriangle {
    public static void printLine(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(" "+i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете n: ");
        int n = input.nextInt();
        input.close();
        System.out.println();

        printTriangle(n);


    }

    public static void printTriangle(int n){
        // printing upper part of triangle
        for (int line = 1; line <=n; line++) {
            printLine(1,line);
        }
        // printing bottom part of triangle
        for (int line = n-1; line >=1 ; line--) {
            printLine(1,line);
        }

    }
}

