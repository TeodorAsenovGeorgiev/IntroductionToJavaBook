package codexio;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 13.Напишете програма, която проверява дали дадено число n (n < 100) е просто.
 * 13.Прочетете за цикли в Интернет.
 * Използвайте цикъл и проверете числото за делимост на всички числа от 1 до корен квадратен от числото.
 */
public class Problem3_13_prime {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете чиско което искате да проверите дали е просто: ");
        int n = Integer.parseInt(input.nextLine());
        boolean prime  = n >= 2;
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if (n % i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("Числото е просто");
        }else {
            System.out.println("Числото не е просто");
        }
    }
}
