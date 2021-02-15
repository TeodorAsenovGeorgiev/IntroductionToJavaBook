package codexio;
/**
 * 9.Напишете  програма,  която  преобразува  дадено  число  в  интервала [0..999]в текст, съответстващ на българското произношение.
 * Примери:-0 "Нула"
 * -273 "Двеста седемдесет и три"
 * -400 "Четиристотин"
 * -501 "Петстотин и едно"
 * -711 "Седемстотин и единадесет"
 */

import java.util.Scanner;

public class Problem5_9_0to99InBulgarian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Въведете число и java ще го изпише с Букви: ");
        int number = input.nextInt();
        int hundreds = number/100;
        int tens = number/10%10;
        int ones =  number%10;

        System.out.println(hundreds +" "+ tens +" "+ ones);

        if (hundreds >= 1){
            switch (hundreds){
                case 1: System.out.print("Сто ");break;
                case 2: System.out.print("Двеста ");break;
                case 3: System.out.print("Триста ");break;
                case 4: System.out.print("Четиристотин ");break;
                case 5: System.out.print("Петстотин ");break;
                case 6: System.out.print("Шестотин ");break;
                case 7: System.out.print("Седемстотин ");break;
                case 8: System.out.print("Осемстотин ");break;
                case 9: System.out.print("Деветстотин ");break;
            }
        }
        if(tens>1){
            switch (tens){
                case 2: System.out.print("Двадесет ");break;
                case 3: System.out.print("Тридесет ");break;
                case 4: System.out.print("Четирдесет ");break;
                case 5: System.out.print("Педесет ");break;
                case 6: System.out.print("Шесдесет ");break;
                case 7: System.out.print("Седемдесет ");break;
                case 8: System.out.print("Осемдесет ");break;
                case 9: System.out.print("Деведесет ");break;
            }
            if (ones!=0){
                System.out.print("и ");
            }
        }
        if(tens !=1 && ones !=0){
            switch (ones){
                case 1: System.out.print("Едно");break;
                case 2: System.out.print("Две");break;
                case 3: System.out.print("Три");break;
                case 4: System.out.print("Четири");break;
                case 5: System.out.print("Пет");break;
                case 6: System.out.print("Шест");break;
                case 7: System.out.print("Седем");break;
                case 8: System.out.print("Осем");break;
                case 9: System.out.print("Девет");break;
            }

        }
        if (hundreds==0 && tens == 1){
            switch (ones){
                case 0:System.out.println("Десет");break;
                case 1:System.out.println("Единадесет");break;
                case 2:System.out.println("Дванадесет");break;
                case 3:System.out.println("Тринадесет");break;
                case 4:System.out.println("Четиринадесет");break;
                case 5:System.out.println("Петнадесет");break;
                case 6:System.out.println("Шеснадесет");break;
                case 7:System.out.println("Седемнадесет");break;
                case 8:System.out.println("Осемнадесет");break;
                case 9:System.out.println("Деветнадесет");break;
            }

        }
        if (hundreds == 0 && tens == 0 && ones ==0){
            System.out.println("Нула");
        }
    }
}
//TODO да се оптимизира кода /Не работи за всички случай от 0..999/