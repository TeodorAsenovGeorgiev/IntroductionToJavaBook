package codexio;
import java.util.Scanner;
import java.util.Arrays;
public class Problem7_isArrSymmetric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Моля въведете дължинатта на масива:");
        int n = input.nextInt();
        int [] myArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Въведете %d стойнос от масива: ",i);
            myArr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(myArr));
        System.out.println("Сега ще проверим дали той е симетричен!");
        boolean symmetric = true;
        for (int i = 0; i <(myArr.length-1)/2 ; i++) {
            if (myArr[i]!=myArr[n-1-i]){
                symmetric = false;
            }
        }
        System.out.printf("Symmertic? %b%n",symmetric);
    }
}
