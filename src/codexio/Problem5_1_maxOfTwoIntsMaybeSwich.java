package codexio;

import java.util.Scanner;

/**
 * 1.Да  се  напише if-конструкция,  която  изчислява  стойността  на  две целочислени променливи
 * и разменя техните стойности, ако стойността на първата променлива е по-голяма от втората.
 */
public class Problem5_1_maxOfTwoIntsMaybeSwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set A: ");
        int a = input.nextInt();
        System.out.println("Set B: ");
        int b = input.nextInt();
        int bufferA = a;
        int bufferB = b;
        if (a>b){
            b=a;
            a=bufferB;

            System.out.println("Стойността на пръвата променлива е по-голяма, следователно стойностите ще се разменят");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }
    }
}
//TODO може да бъде оптимизирано!