package codexio;

import java.util.Scanner;

/**
 * 6.Напишете програма, която пресмята N!/K!за дадени N и K (1<K<N).
 */
public class Problem6_6_NfactDivKfact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(1<K<N)");
        System.out.println("Въведете N, където (1<K<N)");
        int N = input.nextInt();
        System.out.println("Въведете К, където (1<K<N)");
        int K = input.nextInt();
        int n =1;
        int k = 1;

        for (int i = 1; i <= N ; i++) {
            n*=i;
        }
        for (int i = 1; i <=K ; i++) {
            k*=i;
        }
        System.out.println(n/k);
    }
}
