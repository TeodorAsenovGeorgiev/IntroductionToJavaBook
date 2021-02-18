package codexio;
/**
 * 4.Напишете  програма,  която  намира  максималната  редица  от  еднакви елементи в масив.
 * Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1}  2, 2, 2
 */

import java.util.Arrays;

public class Problem7_4_maxLineInArr {
    public static void  main  (String[] args){
        int[] arr = new int[]{2, 1, 1, 2, 3, 3, 2,2,2,2,1};
        int start = 0;
        int lenght = 1;
        int bestStart = 0;
        int bestLength = 1;

        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]==arr[i+1]){
                lenght++;
                start = i;
                if (lenght > bestLength){
                    bestLength = lenght;
                    bestStart = start;
                }
            }else {
                lenght = 1;
                start = i;
            }
        }

        System.out.println(bestStart-1);
        System.out.println(bestLength);
//        int toIndex = bestStart+bestLength;
       int[] result = Arrays.copyOfRange(arr,bestStart,bestStart+bestLength-1);
        System.out.println(Arrays.toString(result));



        }
    }

