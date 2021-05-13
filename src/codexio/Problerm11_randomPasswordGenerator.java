package codexio;

import java.util.Random;

public class Problerm11_randomPasswordGenerator {
    private static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private  static final String SMALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS= "0123456789";
    private static final String SPECIAL_CHARS="~!@#$%^&*()_+=`{}[]\\|':;.,/?<>";
    private static final String ALL_CHARS = CAPITAL_LETTERS+SMALL_LETTERS+DIGITS+SPECIAL_CHARS;

    private  static Random  rnd = new Random();

    public static void main(String[] args) {
        StringBuilder password = new StringBuilder();

        //Generate two random capital letters
        for (int i = 1; i <2; i++) {
            char capitalLetter = generateChar(CAPITAL_LETTERS);
            insertRandomPosition(password,capitalLetter);
        }
        //Generate two random small letters
        for (int i = 1; i <2; i++) {
            char smallLetter = generateChar(SMALL_LETTERS);
            insertRandomPosition(password,smallLetter);
        }
        //generate one random digit
        char digit = generateChar(DIGITS);
        insertRandomPosition(password,digit);

        //generate 3 special characters
        for (int i = 1; i < 3; i++) {
            char specialChar = generateChar(SPECIAL_CHARS);
            insertRandomPosition(password,specialChar);
        }

        //Generate few random characters (between 0 and 7)

        int count = rnd.nextInt(8);
        for (int i = 0; i <count; i++) {
            char specialChar = generateChar(ALL_CHARS);
            insertRandomPosition(password,specialChar);
        }
        System.out.println(password);
    }

    private static void  insertRandomPosition(StringBuilder password, char character){
        int randomPosition = rnd.nextInt(password.length()+1);
        password.insert(randomPosition,character);

    }

    private static char generateChar(String availableChars){
        int randomIndex = rnd.nextInt(availableChars.length());
        char randomChar = availableChars.charAt(randomIndex);
        return randomChar;
    }
}

