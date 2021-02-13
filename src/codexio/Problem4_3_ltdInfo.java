package codexio;

import java.util.Scanner;

/**
 * 3.Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт и мениджър.
 * Мениджърът има име, фамилия и телефонен номер.
 * Напишете програма, която чете информацията за компанията и нейния мениджър
 * и я отпечатва след това на конзолата.
 */
public class Problem4_3_ltdInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете името на фирмата: ");
        String ltdName = input.nextLine();
        System.out.println("Въведете адреса на фирмата: ");
        String ltdAdress = input.nextLine();
        System.out.println("Въведете телефонния номер на фирмата: ");
        String ltdTelephone = input.nextLine();
        System.out.println("Въведете факс номера на фирмата: ");
        String ltdFax = input.nextLine();
        System.out.println("Въведете уеб сайт на фирмата: ");
        String ltdWebSite = input.nextLine();
        System.out.println("Въведете името на мениджъра: ");
        String ltdManagerName = input.nextLine();
        System.out.println("Въведете фамилията на мениджъра: ");
        String ltdManagerLastname = input.nextLine();
        System.out.println("Въведете телефонен номер на мениджъра: ");
        String ltdManagerTelephone = input.nextLine();

        System.out.printf("Името на фирмата е %s , с постоянен адрес: %s ,телефонен номер: %s , факс: %s, web: %s.  %n",ltdName,ltdAdress,ltdTelephone,ltdFax,ltdWebSite);
        System.out.printf("Мениджър на фирмата е: %s %s , с телефон за връзка: %s", ltdManagerName,ltdManagerLastname, ltdManagerTelephone);
    }
}
