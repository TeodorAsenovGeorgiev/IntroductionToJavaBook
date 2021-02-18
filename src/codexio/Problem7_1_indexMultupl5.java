package codexio;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 1.Да  се  напише  програма,  която  създава  масив  с  20  елемента  от целочислен тип
 * и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5.
 * Елементите на масива да се изведат на конзолата
 */
public class Problem7_1_indexMultupl5 {
    public static void main(String[] args) {
        int[] arrIndexMultip = new int[20];
        for (int i = 0; i < arrIndexMultip.length; i++) {
            arrIndexMultip[i]=i*5;
        }
        System.out.println(Arrays.toString(arrIndexMultip));
    }
}
