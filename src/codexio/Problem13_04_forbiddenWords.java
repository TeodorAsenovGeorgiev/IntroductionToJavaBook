package codexio;

public class Problem13_04_forbiddenWords {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
String input = "Microsoft announced its next generation Java compiler today. " +
        "It uses advanced parser and special optimizer for the Microsoft JVM.";
      String result =  input.replace("Java","****").replace("JVM","***").replace("Microsoft","*********");
        System.out.println(result);

    }
}
