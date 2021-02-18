package codexio;
import java.util.Scanner;
import java.util.Arrays;
public class Problem7_reverseArr {
    public static void main(String[] args) {
        int[] myArray ={1,2,3,4,5,6};
        System.out.println(Arrays.toString(myArray));

        int lenght = myArray.length;
        int[] reveredArray = new int[lenght];

        for (int index = 0; index <lenght ; index ++) {
            reveredArray[lenght -1 - index] = myArray[index];
        }
        System.out.println(Arrays.toString(reveredArray));

    }
}
