package codexio;


import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem13_03_toUpper {
    public static void main(String[] args) {
        String input = "We are living in a <upcase>yellow submarine</upcase>. " +
                "We don't have <upcase>anything</upcase> else.";
        Pattern pattern = Pattern.compile("(?<=<upcase>)(.*?)(?=</upcase>)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            var zaRepleisvane = matcher.group();
            input = input.replace(zaRepleisvane, zaRepleisvane.toUpperCase());
        }


        input =  input.replace("<upcase>", "").replace("</upcase>","");
        System.out.println(input);
    }
}
