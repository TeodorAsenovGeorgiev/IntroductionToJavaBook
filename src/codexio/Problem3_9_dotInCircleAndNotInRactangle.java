package codexio;

import java.util.Scanner;
import java.lang.*;

/**
 * 9.Напишете програма, която проверява дали дадена точка О (x, y)
 * е вътре в окръжността К ((0,0), 5) и е извън правоъгълника ((-1, 1), (5, 5).
 */

public class Problem3_9_dotInCircleAndNotInRactangle {
    public static void main (String[]args){
        int r = 5;
        int x1 = -1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 5;
        System.out.println("Въведете х= ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Въведете y= ");
        int y = input.nextInt();
        if ((Math.sqrt((x*x)+(y*y))<r)&&(x <= x1 || x >= x2 || y <= y1 || y >= y2)) {
            System.out.println("ДА, Точката се намира въте в Окръжността и извън правоъгълника");
        } else {
            System.out.println("НЕ");

        }
    }
}
