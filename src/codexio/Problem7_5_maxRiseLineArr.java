package codexio;

import java.util.Arrays;


/**
 * 5.Напишете програма, която намира максималната редица от нарастващи елементи в масив.
 * Пример: {3, 2, 3, 4, 2, 2, 4} {2, 3, 4}
 */
public class Problem7_5_maxRiseLineArr {
    public static void main(String[] args) {


        int[] arr = new int[]{3, 2, 3, 4, 2, 2, 4};
        int start = 0;
        int lenght = 1;
        int bestStart = 0;
        int bestLength = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                if(arr[i]<arr[i+1]){
                    start = i;

                    lenght++;

                }
            } else {lenght = 1;
            }
            if (lenght > bestLength) {
                bestStart = start;
                bestLength = lenght;

            }
        }
        int toIndex = bestStart + bestLength;
        int[] result = Arrays.copyOfRange(arr, bestStart-1 , toIndex-1);
        System.out.println(Arrays.toString(result));


    }
}

