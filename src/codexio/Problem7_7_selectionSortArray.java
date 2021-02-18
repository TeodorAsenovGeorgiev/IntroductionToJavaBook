package codexio;
/**
 * 7.Сортиране на масив означава да подредим елементите му в нарастващ (намаляващ)  ред.
 * Напишете  програма,  която  сортира  масив.  Да  се използва алгоритъма "Selection sort".
 */

import java.util.Arrays;
public class Problem7_7_selectionSortArray {
    public static void main(String[] args) {

        int size, i, j, temp;
        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        size = 13;

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}



