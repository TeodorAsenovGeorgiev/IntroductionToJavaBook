package codexio;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
//        int num = 1;
//        int sum = 1;
//        System.out.print("The sum 1");
//        while(num < n)
//        {
//            num++;
//            sum *= num;
//            System.out.printf("*%d", num);
//        }
//        System.out.printf("= %d%n", sum);
    }
}
