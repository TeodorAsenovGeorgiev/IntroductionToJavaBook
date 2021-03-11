package codexio;

public class Problem9_7_PritReverseNumber {
    public static String pritnReverseNumber(int number){
        String stringNum=String.valueOf(number);
        String output="";
        for (int i = stringNum.length()-1; i >=0 ; i--) {
            output = output+stringNum.charAt(i);
        }
        return output;
    }

    public static void main(String[] args) {
      String result = pritnReverseNumber(1234);
        System.out.println(result);
    }
}
