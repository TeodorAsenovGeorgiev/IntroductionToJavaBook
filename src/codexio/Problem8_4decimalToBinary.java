package codexio;

import java.util.Scanner;

public class Problem8_4decimalToBinary {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете число: ");
        int decimal = input.nextInt();
        int[] reverseBinary = new int[64];
        int index = 0;

      while (decimal>0){
        reverseBinary[index++]=decimal%2;
        decimal=decimal/2;
      }
        for (int i = index-1; i >=0 ; i--) {
            System.out.print(reverseBinary[i]);
        }

        }

    }



