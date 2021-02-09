package codexio;

/**
 * 1.Напишете израз, който да проверява дали дадено цяло число е четно или нечетно
 */
public class Problem3_1_evenOrOdd {
    public static void main(String[]args){
       int a = 5;
       int b = a%2;
       System.out.println(b==0?"even":"odd");
    }
}
