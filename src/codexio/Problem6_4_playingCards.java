package codexio;

/**
 * 4.Напишете  програма,  която  отпечатва  всички  възможни  карти  от стандартно тесте без джокери
 * (имаме 52 карти: 4 бои по 13 карти)
 *
 * 4.Номерирайте картите от 2 до 14 (тези числа ще съответстват на картите от 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A).
 * Номерирайте боите от 1 до 4 (1 -спатия, 2 –каро, 3 –купа, 4 –пика).
 * Сега вече можете да завъртите 2 вложени цикъла и да отпечатате всяка от картите.
 */
public class Problem6_4_playingCards {
    public static void main(String[] args) {

        for (int s = 0; s < 4; s++) {
            for (int r = 0; r <13 ; r++) {
                String rank = String.valueOf((r+1));
                switch (r){
                    case 0: rank="Асо";break;
                    case 10: rank="Вале";break;
                    case 11: rank="Дама";break;
                    case 12: rank="Поп";break;
                }
                String suit = String.valueOf(0);
                switch (s){
                    case 0: suit = "Пика";break;
                    case 1: suit = "Купа";break;
                    case 2: suit = "Каро";break;
                    case 3: suit = "Спатия";break;
                }
                System.out.println(rank + " " + suit);
            }
        }
    }

}
