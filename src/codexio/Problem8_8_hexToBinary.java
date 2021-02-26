package codexio;

import java.util.Scanner;

public class Problem8_8_hexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете шеснайсетично число: ");
        String inputString= input.nextLine();
        int [] hex = new int[inputString.length()];
        for (int i = 0; i <inputString.length(); i++) {
            switch (inputString.charAt(i)){
                case '0':hex[i]=0;break;
                case '1':hex[i]=1;break;
                case '2':hex[i]=2;break;
                case '3':hex[i]=3;break;
                case '4':hex[i]=4;break;
                case '5':hex[i]=5;break;
                case '6':hex[i]=6;break;
                case '7':hex[i]=7;break;
                case '8':hex[i]=8;break;
                case '9':hex[i]=9;break;
                case 'A':hex[i]=10;break;
                case 'B':hex[i]=11;break;
                case 'C':hex[i]=12;break;
                case 'D':hex[i]=13;break;
                case 'E':hex[i]=14;break;
                case 'F':hex[i]=15;break;
            }
        }
        int result = 0;
        int power = hex.length-1;
        for (int i = 0; i <=hex.length-1 ; i++) {
            result+= hex[i]* Math.pow(16,power);
            power--;
        }

        int[] reverseBinary = new int[64];
        int index = 0;

        while (result>0){
            reverseBinary[index++]=result%2;
            result=result/2;
        }
        for (int i = index-1; i >=0 ; i--) {
            System.out.print(reverseBinary[i]);
        }

    }

}
