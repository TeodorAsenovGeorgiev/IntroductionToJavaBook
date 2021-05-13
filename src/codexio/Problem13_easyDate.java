package codexio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem13_easyDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String userInput = "22.08.1990";
        try {
            Date date = sdf.parse(userInput);
            System.out.println(date);
        }catch (ParseException pe){
            System.out.println("Error parsing " + userInput);
        }
    }
}
