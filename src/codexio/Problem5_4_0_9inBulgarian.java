package codexio;
/**
 * 4.Напишете програма, която за дадена цифра (0-9), зададена катовход, извежда името на цифрата на български език.
 */

import java.util.Scanner;

public class Problem5_4_0_9inBulgarian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете число от 1 до 9 : ");
        int number = input.nextInt();
        switch (number){
            case 0: System.out.println("Нула");break;
            case 1: System.out.println("Едно");break;
            case 2: System.out.println("Две");break;
            case 3: System.out.println("Три");break;
            case 4: System.out.println("Четири");break;
            case 5: System.out.println("Пет");break;
            case 6: System.out.println("Шест");break;
            case 7: System.out.println("Седем");break;
            case 8: System.out.println("Осем");break;
            case 9: System.out.println("Девет");break;
            default:System.out.println("Въвели сте нещо различно от числата от 1 до 9");
        }

    }
}
