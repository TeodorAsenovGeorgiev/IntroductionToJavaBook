package codexio;

import java.util.Scanner;

public class Problem8_10_horner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете двойчно число: ");
        String inputString= input.nextLine();
        int [] binary = new int[inputString.length()];
        for (int i = 0; i <inputString.length(); i++) {
            binary[i]=Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }
        int result = 0;

        for (int i = 0; i <=binary.length-1 ; i++) {
            result = (binary[i]*2 + binary[i+1])*2;break;

        }
        for (int j = 2; j <=binary.length-1  ; j++) {
            result=  (result+ binary[j])*2;
            if(j<binary.length-1){
                result += binary[binary.length-1] ;
                break;
            }
        }


        System.out.println(result);
    }
}
//TODO