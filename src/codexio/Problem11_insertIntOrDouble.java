package codexio;
import java.util.*;
public class Problem11_insertIntOrDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<Double> doubles = new ArrayList<Double>();

        while (true){
            if (input.hasNextInt()){
                ints.add(input.nextInt());
            }else if(input.hasNextDouble()){
                doubles.add(input.nextDouble());
            }else {
                break;
            }
        }
        System.out.printf("You entered these ints: %s%n", ints.toString());
        System.out.printf("You entered these doubles %s%n", doubles.toString());
    }
}
