package codexio;

import java.util.Arrays;

public class Problem13_07_splitBySlash {
    public static void main(String[] args) {
        String input = "one\\two\\thre";
        String[] outputArr = input.split("[\\\\]");
        System.out.println(Arrays.deepToString(outputArr));
    }
}
