package codexio;

import java.util.Scanner;

public class Problem8_5_binaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете число: ");
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

        System.out.println(result);
    }


}
