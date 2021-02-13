package codexio;
/**
 * 5.Напишете програма, която чете от конзолата две цели числа и отпечатва по-голямото  от  тях.
 * Реализирайте  програмата  без  използването  на сравнение. Забележка: задачата изисква малко да помислите!
 * Нека числата са a и b. Използвайте следните преобразувания: a=a-b; b=b+a; a=b-a.
 */

import java.util.Scanner;

public class Problem4_5_maxInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете А: ");
        int a = input.nextInt();
        System.out.println("Въведете Б: ");
        int b = input.nextInt();
        int z, i, max;
        z = a - b;
        i = (z >> 31) & 0x1;
        max = a - i * z;
        System.out.println(max + " е по-голямото число!");

        //int max = (int) 0.5*(a+b + Math.abs(a-b))

        //int a = Integer.MIN_VALUE;
        //int b = Integer.MAX_VALUE;
//TODO Да се осмисли още логиката!

    }
}
