package codexio;

import java.util.Scanner;

public class Problem9_3_lastNum {
    public static int lastNum(int num){

        int lastNumber = num%10;
        return lastNumber;
    }
    public static String printNum(int num){
       String printNum="";
        switch (num){
            case 0: System.out.print("Нула");break;
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
        return printNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете число: ");
        int number = input.nextInt();
        System.out.println(printNum(lastNum(number)));;
    }
}
