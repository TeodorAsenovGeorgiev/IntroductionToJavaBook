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

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = arr[i];

            if (sum < S) {
                System.out.print("Num: " + arr[i] + ", ");
            } else if (sum > S) {
                System.out.println("Sum not reached!");
                System.out.println();
                continue;
            } else {
                System.out.println("Last num: " + arr[i] + " :( Sum not reached!");
                System.out.println("Sum: " + sum);
            }
            for (int j = i + 1; j < arr.length; j++) {

                sum += arr[j];

                if (sum < S) {
                    System.out.print("Num: " + arr[j] + ", ");
                } else if (sum > S) {
                    System.out.println("Num: " + arr[j] + " :( Sum not reached! :(");
                    System.out.println();
                    sum -= arr[j];
                } else {
                    System.out.print("Num: " + arr[j] + ", ");
                    System.out.println("Sum: " + sum + " !!!!!!!!!!");
                    System.out.println();
                    sum -= arr[j];
                }

            }
        }
    }
}
