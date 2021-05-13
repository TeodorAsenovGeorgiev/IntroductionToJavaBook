package codexio;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * [protocol]://[server]/[resource]
 *  http://www.devbg.org/forum/index.php
 *  резултатът е:
 *  [protocol]="http"
 *  [server]="www.devbg.org"
 *  [resource]="/forum/index.php"
 */
public class Problem13_05_URL {
    public static void main(String[] args) {
        String input = "http://www.devbg.org/forum/index.php";
        String regex = "^((http[s]?|ftp):\\/)?\\/?([^:\\/\\s]+)((\\/\\w+)*\\/)([\\w\\-\\.]+[^#?\\s]+)(.*)?(#[\\w\\-]+)?$";
        Pattern pattern = Pattern.compile("^((http[s]?|ftp):\\/)?\\/?([^:\\/\\s]+)((\\/\\w+)*\\/)([\\w\\-\\.]+[^#?\\s]+)(.*)?(#[\\w\\-]+)?$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find( )) {
            System.out.println("[protocol]= " + matcher.group(2) );
            System.out.println("[server]= " + matcher.group(3) );
            System.out.println("[resource]= " + matcher.group(4)+matcher.group(6) );
        } else {
            System.out.println("NO MATCH");
        }
    }

}

