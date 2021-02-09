package codexio;

import java.util.Scanner;

/**
 * 3.Напишете израз, който да проверява дали дадено цяло число съдържа 7 за трета цифра (отдясно на ляво).
 */
public class Problem3_3_isThisSeven {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a Number");
        int number = input.nextInt();
        int div100 = number / 100;
        int div10 = div100%10;
        System.out.println((div10==7)?(true):(false));
    }
}