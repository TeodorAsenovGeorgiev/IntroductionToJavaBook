package codexio;

public class Problem7_9_IvanYonkov2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 4, 2, 5, 8};
        int S = 11;
        String result = "";

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            result = "";
            sum = arr[i];
            if (sum < S) {
                result += arr[i] + ", ";
            } else if (sum > S) {
                continue;
            } else {
                result += arr[i];
                System.out.println(result + ", Sum: " + sum);
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                result += arr[j] + ", ";
                if (sum > S) {
                    result = result.substring(0, result.lastIndexOf(arr[j] + ", "));
                    sum -= arr[j];
                } else if (sum == S) {
                    System.out.println(result + "Sum: " + sum);
                    result = result.substring(0, result.lastIndexOf(arr[j] + ", "));
                    sum -= arr[j];
                }
            }
        }
    }
}
