package codexio;

import java.util.Scanner;

public class Problem5_7_SumEqualZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = input.nextInt();
        System.out.println("Enter second number: ");
        int second = input.nextInt();
        System.out.println("Enter third number: ");
        int third = input.nextInt();
        System.out.println("Enter fourth number: ");
        int fourth = input.nextInt();
        System.out.println("Enter fifth number: ");
        int fifth = input.nextInt();

        if(first + second == 0) System.out.printf("%d + %d = %d\n",first,second,first+second);
        if(first + third == 0) System.out.printf("%d + %d = %d\n",first,third,first+third);
        if(first + fourth == 0) System.out.printf("%d + %d = %d\n",first,fourth,first+fourth);
        if(first + fifth == 0)System.out.printf("%d + %d = %d\n",first,second,first+second);
        if(second + third == 0) System.out.printf("%d + %d = %d\n",second,third,second+third);
        if(second + fourth == 0) System.out.printf("%d + %d = %d\n",second,fifth,second+fourth);
        if(second + fifth == 0) System.out.printf("%d + %d = %d\n",second,fifth,second+fifth);
        if(third + fourth == 0) System.out.printf("%d + %d = %d\n",third,fourth,third+fourth);
        if(third + fifth == 0) System.out.printf("%d + %d = %d\n",third,fifth,third+fifth);
        if(fourth + fifth == 0) System.out.printf("%d + %d = %d\n",fourth,fifth,fourth+fifth);

        if(first + second + third == 0) System.out.printf("%d + %d + %d= %d\n",first,second,third,first+second+third);
        if(first + second + fourth == 0) System.out.printf("%d + %d + %d= %d\n",first,second,fourth,first+second+fourth);
        if(first + second + fifth == 0) System.out.printf("%d + %d + %d= %d\n",first,second,fifth,first+second+fifth);

        if(first + third + fourth == 0) System.out.printf("%d + %d + %d= %d\n",first,third,fourth,first+third+fourth);
        if(first + third + fifth == 0) System.out.printf("%d + %d + %d= %d\n",first,third,fifth,first+third+fifth);

        if(second + third + fourth == 0) System.out.printf("%d + %d + %d= %d",second,third,fourth,second+third+fourth);
        if(second + third + fifth == 0) System.out.printf("%d + %d + %d= %d",second,third,fifth,second+third+fifth);
        if(third + fourth + fifth == 0) System.out.printf("%d + %d + %d= %d",third,fourth,fifth,third+fourth+fifth);



    }
}
