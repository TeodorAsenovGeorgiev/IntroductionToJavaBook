package codexio;

import java.util.Scanner;
import java.lang.*;

/**
 * 8.Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5).
 * 8.Използвайте питагоровата теорема c2 = a2 + b2. За да е вътре в кръга, то c следва да е по-малко от 5
 */
public class Problem3_8_dotInCircle {
    public static void main (String[]args){
        System.out.println("Въведете х= ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Въведете y= ");
        int y = input.nextInt();
        if (Math.sqrt((x*x)+(y*y))<5){
            System.out.println("Точката се намира въте в Окръжността");
        }else {
            System.out.println("Точката се намира извън Окръжността");

        }
        //(Math.sqrt((x*x)+(y*y))<5)?"Вътре е":"Вън е";
    }
}
