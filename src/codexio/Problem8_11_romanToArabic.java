package codexio;

import java.util.Locale;
import java.util.Scanner;

public class Problem8_11_romanToArabic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете римско число: ");
        String roman = input.next();
        input.close();
        roman = roman.toUpperCase();
        int current = 0;
        int previous = 0;
        int arabic = 0;
        int i =0;
        while (i<roman.length()){
            char letter = roman.charAt(i);

            switch (letter){
                case ('I'):current = 1;break;
                case ('V'):current = 5;break;
                case ('X'): current = 10;break;
                case ('L'): current = 50;break;
                case ('C'): current = 100;break;
                case ('D'): current = 500;break;
                case ('M'): current = 1000;break;
            }
            if (current > previous){
                arabic += current - (previous * 2);
            }else {
                arabic+=current;
            }
            previous = current;
            i++;
        }
        System.out.println("Arabic: " + arabic);
    }
}
