package codexio;
/**
 * 3.Напишете  програма,  която  намира  най-голямото  по  стойност  число, измежду три дадени числа
 */

import java.util.Scanner;

public class Problem5_3_bigesIntInThreeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set A: ");
        int a = input.nextInt();
        System.out.println("Set B: ");
        int b = input.nextInt();
        System.out.println("Set C: ");
        int c = input.nextInt();
        if (a>b && a>c){
            System.out.println("A is the bigest number = " +a);
        }if (b>a && b>c){
            System.out.println("B is the bigest number = " +b);
        }if (c>a && c>b){
            System.out.println("C is the bigest number = " +c);
        }else {
            System.out.println("The numbers are equal");
        }
    }
}
//TODO да се добавят проверки ако числата са еднакви(не работи за всички входове)