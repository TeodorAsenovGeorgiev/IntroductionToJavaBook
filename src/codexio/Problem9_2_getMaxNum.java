package codexio;

import java.util.Scanner;

public class Problem9_2_getMaxNum {

    public static void getMax(float a,float b,float c){
        float maxNum = Math.max(Math.max(a,b),c);
        Utils.isNumeric(maxNum);
        System.out.println(maxNum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number One: ");
        float a = input.nextFloat();
        System.out.println("Input Number Two: ");
        float b = input.nextFloat();
        System.out.println("Input Number Three: ");
        float c = input.nextFloat();

        getMax(a,b,c);

    }
}
