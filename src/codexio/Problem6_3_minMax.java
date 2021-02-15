package codexio;

import java.util.Scanner;

/**
 * 3.Напишете програма, която чете от конзолата поредица от цели числа и отпечатва най-малкото и най-голямото от тях
 */
public class Problem6_3_minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете броя числа:  ");
        int maxNumbers = input.nextInt();
        int min =99999;
        int max =-9999;


            for (int i = 1; i <=maxNumbers ; i++) {
                System.out.println("Въведете число: ");
                int number = input.nextInt();
                if (number < min){
                    min =number;
                }if(number > max){
                    max = number;
                }
            }

            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
    }
}
