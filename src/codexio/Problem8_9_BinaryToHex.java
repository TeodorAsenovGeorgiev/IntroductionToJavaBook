package codexio;

import java.util.Scanner;

public class Problem8_9_BinaryToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете Двоично число: ");
        String inputString= input.nextLine();
        int [] binary = new int[inputString.length()];
        for (int i = 0; i <inputString.length(); i++) {
            binary[i]=Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }
        int result = 0;
        int power = binary.length-1;
        for (int i = 0; i <=binary.length-1 ; i++) {
            result+= binary[i]* Math.pow(2,power);
            power--;
        }


        int[] reverseHex = new int[64];
        int index = 0;

        while (result>0){
            reverseHex[index++]=result%16;
            result=result/16;
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
