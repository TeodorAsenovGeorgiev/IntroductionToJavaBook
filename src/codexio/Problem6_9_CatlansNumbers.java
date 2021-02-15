package codexio;

import java.util.Scanner;

/**
 * 9.В  комбинаториката  числата  на  Каталан  (Catalan’s  numbers)
 * се изчисляват по следната формула:(2*n)!/((n+1)!*n!) , за n ≥ 0.
 * Напишете програма, която изчислява N-тото число на Каталан за дадено
 */
public class Problem6_9_CatlansNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете n :  (n>=0)");
        int n = input.nextInt();
        int fac2N = 1;
        int facNPlus1 = 1;
        int facN = 1;

        for (int i = 1; i <=2*n ; i++) { fac2N*=i;}
        for (int i = 1; i <=n+1 ; i++) { facNPlus1*=i;}
        for (int i = 1; i <=n ; i++) { facN*=i;}

        int sum = fac2N/(facNPlus1*facN);
        System.out.println(sum);
    }
}
