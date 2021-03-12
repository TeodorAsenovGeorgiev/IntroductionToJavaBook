package codexio;

import java.math.BigInteger;

/**
 * Напишете  програма,  която  пресмята  и  отпечатва n!за  всяко  n  в интервала [1..100]
 */

public class Problem9_8_factorial {

    public static int factorial(int number){
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result = result *i;
        }
        return result;
    }

    public static  BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {

        System.out.println(factorialHavingLargeResult(100));
    }
}
