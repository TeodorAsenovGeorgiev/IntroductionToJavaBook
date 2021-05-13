package codexio;

import java.util.Scanner;

public class Problem13_02_search {
    public static void main(String[] args) {

        String input = "We are living in a yellow submarine. " +
                "We don't have anything else. " +
                "inside the submarine is very tight. " +
                "So we are drinking all the day. We will move out of it in 5 days.";

        String search ="in";
        int index = input.indexOf(search);
        int counter = 0;
        while (index !=-1){
            counter++;
            index = input.indexOf(search,index+1);
        }
        System.out.printf("Found: %d",counter);
    }
}
