package codexio;

public class Problem13_03_toUpperVersion2 {
    public static void main(String[] args) {

        String input = "We are living in a <upcase>yellow submarine</upcase>. " +
                "We don't have <upcase>anything</upcase> else.";

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            var sI = input.indexOf("<upcase>", i);
            if (sI == -1) {
                result += input.substring(i);
                break;
            }

            result += input.substring(i, sI);

            var end = input.indexOf("</upcase>", i);

            var start = sI + 8;

            var content = input.substring(start, end).toUpperCase();

            result += content;

            i = end + 8;
        }
        System.out.println(result);
    }
}
