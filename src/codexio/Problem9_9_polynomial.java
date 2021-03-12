package codexio;

import java.util.Arrays;

public class Problem9_9_polynomial {
    private final double[] coeff;

    public Problem9_9_polynomial(double... coeff) {
        this.coeff = coeff;
    }

    @Override
    public String toString() {

        return Arrays.toString(coeff);
    }

    public Problem9_9_polynomial multiply(Problem9_9_polynomial polynomial) {
        int totalLength = coeff.length + polynomial.coeff.length - 1;
        double[] result = new double[totalLength];
        for (int i = 0; i < coeff.length; i++)
            for (int j = 0; j < polynomial.coeff.length; j++) {
                result[i + j] += coeff[i] * polynomial.coeff[j];
            }
        return new Problem9_9_polynomial(result);
    }

    public static void main(String... args) {
        Problem9_9_polynomial p1 = new Problem9_9_polynomial(1, 2, 3);
        System.out.println(p1 + "^2 =" + p1.multiply(p1));
        Problem9_9_polynomial p2 = new Problem9_9_polynomial(3, -1, -1);
        System.out.println(p1 + "*" + p2 + "=" + p1.multiply(p2));
    }
}
//TODO да се усмисли кода!