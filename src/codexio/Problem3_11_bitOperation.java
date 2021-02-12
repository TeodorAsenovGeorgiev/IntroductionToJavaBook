package codexio;

import java.util.Scanner;

/**
 * 11.Дадено е число n и позиция p. Напишете поредица от операции,
 * които да отпечатат стойността на бита на позиция p от числото n (0 или 1).
 * Пример: n=35, p=5 -> 1. Още един пример: n=35, p=6 -> 0
 */
public class Problem3_11_bitOperation {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете n: ");
        int n = input.nextInt();
        System.out.println("Въведете p: ");
        int p = input.nextInt();
        int i = 1; //0000 0001
        int mask = i << p; // Move the 1st bit with p positions
        System.out.println((n & mask)!=0?1:0);
    }
}
