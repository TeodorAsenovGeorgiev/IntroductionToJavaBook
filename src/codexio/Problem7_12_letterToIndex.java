package codexio;

import java.util.Scanner;

/**
 * 12.Да  се  напише  програма,  която създава  масив  с  всички  букви  от латинската азбука.
 * Да се даде възможност на потребител да въвежда дума от конзолата и в
 * резултат да се извеждат индексите на буквите от думата.
 */
public class Problem7_12_letterToIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Моля въведете дума с малки букви!");
        String word = input.next();
        char[] worldArr = new char[word.length()];
        for (int i = 0; i <word.length() ; i++) {
            worldArr[i] = word.charAt(i);
        }

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','o','p','q','r','s','t','u','v','w','x','u','z'};

        for (int i = 0; i <worldArr.length; i++) {
            for (int j = 0; j <alphabet.length; j++) {
                if (worldArr[i] == alphabet[j]){
                    System.out.println(worldArr[i] + " Alphabet index is: " + j);

                }
            }
        }
    }
}
