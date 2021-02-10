package codexio;

import java.util.Scanner;

/**
 * 7.Силата на гравитационното поле на луната е приблизително 17% от това на земята.
 * Напишете програма, която да изчислява тежестта на човек на луната, по дадената тежест на земята.
 *
 * !!! След като направих проучване, правилната стойност е 16,6% !!!
 *
 */
public class Problem3_7_moonGravity {
    public static void main(String[] args) {
        System.out.println("Java се стартира....");
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете вашите килограми: ");
        int kg = input.nextInt();
        double moonKg = ((16.6*kg)/100);
        System.out.println("Ако отидете на Луната Вие ще тежите: " +moonKg + " кг.");
    }
}
