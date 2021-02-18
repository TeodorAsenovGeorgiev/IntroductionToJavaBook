package codexio;

/**
 * 9.Да  се  напише  програма,  която  намира  последователност  от  числа  в масив,
 * които имат сума равна на число,въведено от конзолата (ако има такава).
 * Пример: {4, 3, 1, 4, 2, 5, 8}, S=11 {4, 2, 5}.
 */

public class Problem7_9_sumLineMustbeN {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 4, 2, 5, 8};
        int S = 11;

        int tempSum=arr[0];
        int startIndex = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];
                if (arr[j]+arr[j+1]< S){

                    tempSum += arr[j];
                }
                if (tempSum >S){
                    tempSum = arr[j];
            } if(tempSum == S){

                }
//
//                    System.out.println(startIndex);
//                    System.out.println(count);
//                }
            }
        }
        System.out.println(tempSum);

    }
}
//TODO NOT FINISHED