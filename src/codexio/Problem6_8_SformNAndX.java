package codexio;

import java.util.Scanner;

/**
 * 8.Напишете програма, която за дадено цяло число N, пресмята сумата:S = 1+ 1!/x + 2!/x^2 ... до N Пъти
 */
public class Problem6_8_SformNAndX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int sum = 1, temp = 1;
        for (int i = 1; i <= n; i++)
        {
            temp *= i / x;
            sum += temp;
        }
        System.out.println(sum);
    }

}
//TODO да се помисли още малко, но работи