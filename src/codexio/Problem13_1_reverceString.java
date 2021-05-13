package codexio;

import java.util.Scanner;

/**
 * Напишете  програма,  която  прочита  символен  низ,  обръща  го отзад напред и го принтира обратно на конзолата.
 * Например: "introduction""noitcudortni"
 */
public class Problem13_1_reverceString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        StringBuilder result = new StringBuilder();
        for (int i  = input.length()-1; i>=0;i--) {
            result.append(input.charAt(i));

        }
        System.out.println(result);

    }
}
