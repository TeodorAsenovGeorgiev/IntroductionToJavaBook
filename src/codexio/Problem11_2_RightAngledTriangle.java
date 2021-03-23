package codexio;

public class Problem11_2_RightAngledTriangle {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Input Lenght of A side: ");
        double a = input.nextDouble();
        System.out.println("Input Lenght of B side: ");
        double b = input.nextDouble();

        double c = Math.sqrt (Math.pow(2,a)+Math.pow(2,b));
        System.out.printf("The Lenght of C side is: %f",c);

    }
}
