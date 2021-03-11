package codexio;

/**
 * Напишете метод, който намира колко пъти дадено число се среща в даден  масив.
 * Напишете  програма,  която  проверява  дали  този  метод работи правилно
 */
/*
Методът трябва да приема като параметър масив от числа(int[]) и търсеното число(int)
 */
public class Problem9_4_duplicatesInArr {
    public static void duplicatesInArr(int numer,int...numbers){
            int duplicate = 0;
        for (int i = 0; i < numbers.length; i++) {
                if (numer  == numbers[i]){
                    duplicate++;
                }
            }
        System.out.println(duplicate);
    }

    public static void main(String[] args) {

        duplicatesInArr(5,1,2,3,3,4,5,5,6,7,5);
    }
}
