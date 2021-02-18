package codexio;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 6.Да се напише програма, която чете от конзолата две цели числа N и K, и масив от N елемента.
 * Да се намерят тези K елемента, които имат максимална сума.
 */
public class Problem7_6_maxSumofKLines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете N: (дължината на масива)");
        int N = input.nextInt();
        System.out.println("Въведете К: (броя елементи, на който искаме максималната сума)");
        int K = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Въведете %d стойнос от масива: ",i);
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);//ascending sort of array
        int[] result = Arrays.copyOfRange(arr, arr.length-K ,arr.length);
        System.out.println(Arrays.toString(result));
    }
}
