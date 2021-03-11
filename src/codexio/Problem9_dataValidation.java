package codexio;

import java.util.Scanner;

public class Problem9_dataValidation {


    public static boolean validateHours(int hours){
        boolean result = (hours >=0)&& (hours<24);
        return result;
    }
    public static boolean validateMinutes(int minutes){
        boolean result = (minutes >=0)&&(minutes<=59);
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it?");
        System.out.println("Hours: ");
        int hours = input.nextInt();
        System.out.println("Minutes: ");
        int minutes = input.nextInt();

        boolean isValidTime = validateHours(hours)&&validateMinutes(minutes);

        if (isValidTime){
            System.out.printf("Time is %d:%d now.%n",hours,minutes);
        }else {
            System.out.println("Incorrect time!");
        }

    }
}
