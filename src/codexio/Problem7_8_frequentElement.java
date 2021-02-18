package codexio;
/**
 * 8.Напишете програма, която намира най-често срещания елемент в масив.
 * Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} 4 (5 пъти).
 */

import java.util.Arrays;

public class Problem7_8_frequentElement {
    public static void main(String[] args) {
        int size, i, j, temp;
        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4,4, 9, 3};
        size = 14;

        for (i = 0; i < size; i++) {// sort arr by ascending order
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int lenght =1;
        int bestStart = 0;
        int bestLenght = 1;

        //[1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 9]

        for (int k = 0; k < size - 1; k++){
            if (arr[k] == arr[k+1]){
                start = k;
                lenght++;
                if (lenght > bestLenght){
                    bestStart = start;
                    bestLenght = lenght;
                }

            }else
                lenght = 1;
                start = k;
        }
        System.out.printf("%d (%d пъти)", arr[bestStart],bestLenght);
    }
}
