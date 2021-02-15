package codexio;

import java.util.Scanner;

/**
 * 7.Напишете програма, която пресмята N!*K!/(N-K)!за дадени N и K.
 */
public class Problem6_7_NfacMultiplKfacDivNMinusKfac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(1<K<N)");
        System.out.println("Въведете N, където (1<K<N)");
        int N = input.nextInt();
        System.out.println("Въведете К, където (1<K<N)");
        int K = input.nextInt();
        int J = N-K;
        int n =1;
        int k = 1;
        int j = 1;

        for (int i = 1; i <= N ; i++) {
            n*=i;
        }
        for (int i = 1; i <=K ; i++) {
            k*=i;
        }
        for (int i = 1; i <=J ; i++) {
            j*=i;
        }

        System.out.println((n*k)/j);
    }

    }

