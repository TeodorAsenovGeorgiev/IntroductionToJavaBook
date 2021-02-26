package codexio;

import java.util.Scanner;

public class Problem8_6_decimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете число: ");
        int decimal = input.nextInt();
        int[] reverseHex = new int[64];
        int index = 0;

        while (decimal>0){
            reverseHex[index++]=decimal%16;
            decimal=decimal/16;
        }
        for (int i = index-1; i >=0 ; i--) {

            switch (reverseHex[i]){
                case 0: System.out.print("0");break;
                case 1: System.out.print("1");break;
                case 2: System.out.print("2");break;
                case 3: System.out.print("3");break;
                case 4: System.out.print("4");break;
                case 5: System.out.print("5");break;
                case 6: System.out.print("6");break;
                case 7: System.out.print("7");break;
                case 8: System.out.print("8");break;
                case 9: System.out.print("9");break;
                case 10: System.out.print("A");break;
                case 11: System.out.print("B");break;
                case 12: System.out.print("C");break;
                case 13: System.out.print("D");break;
                case 14: System.out.print("E");break;
                case 15: System.out.print("F");break;
            }

        }
    }
}
