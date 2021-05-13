package codexio;

import java.util.Date;
import java.util.Scanner;

public class Problem13_timeForNumbersConcatenator {
    public static void main(String[] args) {

        System.out.println(new Date());
        String collector = "Numbers: ";
        for (int i = 0; i < 50000; i++) {
            if(i==0) {
                System.out.println("Starting...");
            }
            collector += i;
        }
        System.out.println(collector);
        System.out.println(new Date());
    }
}
