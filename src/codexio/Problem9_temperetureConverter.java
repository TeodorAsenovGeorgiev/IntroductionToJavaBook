package codexio;

import java.util.Scanner;

public class Problem9_temperetureConverter {
    public static double convertFahrenheitToCelsius(double temperatureF){
       double temperatureC= (temperatureF -32)*5/9;
        return temperatureC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your body temperature in Fahrenheit degrees: ");
        double temperature = input.nextInt();

        temperature = convertFahrenheitToCelsius(temperature);

        System.out.printf("Your body temperature is %f Celsius degrees. %n", temperature);

        if (temperature>=37){
            System.out.println("You are ill!!! Corona :D :D :D ");
        }
        if (temperature <=34){
            System.out.println("You are Cold!");
        }
        input.close();
    }
}
