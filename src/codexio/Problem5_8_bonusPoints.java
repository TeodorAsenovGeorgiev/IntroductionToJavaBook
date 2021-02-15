package codexio;
/**
 * 8.Напишете програма, която прилага бонус  точки към дадени точки в интервала [1..9] чрезприлагане на следните правила:-Ако точкитесамежду 1 и 3, програмата гиумножава по 10.
 * -Ако точкитесамежду 4 и 6, гиумножава по 100.
 * -Ако точкитесамежду 7 и 9, гиумножава по 1000.
 * -Ако точкитеса0 или повечеот 9,се отпечатва съобщение за грешка.
 */

import java.util.Scanner;

public class Problem5_8_bonusPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете Точки в интервала от 0 до 9: ");
        int points = input.nextInt();
        if (points>=1 && points<=3){
            System.out.println(points*10);
        }if (points>=4 && points<=6){
            System.out.println(points*100);
        }if (points>=7 && points<=9){
            System.out.println(points*1000);
        }else {
            System.out.println("Неправилно въведени точки");
        }
    }
}
