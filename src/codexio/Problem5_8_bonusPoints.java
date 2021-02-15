package codexio;

import java.util.Scanner;

public class Problem5_8_bonusPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете Точки в интервала от 0 до 9: ");
        int points = input.nextInt();
        if (points>=1 && points<=3){
            System.out.println(points*10);
        }if (points>=4 && points<=6){
            System.out.println(points*100);
        }if (points>=7 && points<=9){
            System.out.println(points*1000);
        }else {
            System.out.println("Неправилно въведени точки");
        }
    }
}
