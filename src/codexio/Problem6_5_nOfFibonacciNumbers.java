package codexio;

import java.util.Scanner;

/**5.Напишете програма, която чете от конзолата числото N и отпечатва сумата на първите N члена от редицата на
 * Фибоначи: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...
 * 5.Числата  на  Фибоначи  започват  от  0  и  1,  като  всяко  следващо  се получава като сума от предходните две
 */
public class Problem6_5_nOfFibonacciNumbers {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Въведете N: ");
       int count = input.nextInt();
        int n1=0,n2=1,n3,sum;
        sum=1;
        System.out.print(n1+" "+n2);//printing 0 and 1
        for (int i = 2; i <count ; i++) {
            n3 = n1+n2;
            sum+=n3;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
        System.out.println("Сумата на поредните елементи е = " + sum);
    }
}
