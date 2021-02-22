package codexio;

import java.util.Scanner;

public class Problem8_4decimalToBinary {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете число: ");
        double decimal = input.nextDouble();

        System.out.println(decimal/2);

    }
}
