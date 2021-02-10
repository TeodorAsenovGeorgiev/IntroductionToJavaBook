package codexio;

import java.util.Scanner;

/**
 * 4.Напишете израз, който да проверява дали третия бит на дадено число е 1 или 0.
 */
public class Problem3_4_thirdBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int number =  input.nextInt();
        int checkNumber = 4;
        System.out.println(((number & checkNumber)!=0)?"true":"false");
    }
}
